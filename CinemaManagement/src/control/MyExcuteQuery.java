/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Bill;
import model.Employee;
import views.Login;
import model.Film;
import model.FilmFormat;
import model.KTG;
import model.Member;
import model.ShowTime;
import model.ShowTimeMovie;
import model.Ticket;

/**
 *
 * @author HAU
 */
public class MyExcuteQuery implements QueryInterface {

    static Connection con;

    public MyExcuteQuery() {
        con = MyConnection.getConnection();
    }

    /*==============================================FOR LOGIN=================================================*/
    //Check status of user account to prevent from logging in twice
    @Override
    public boolean checkStatus(String query, ArrayList<String> para) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            for (int i = 0; i < para.size(); i++) {
                pst.setString(i + 1, para.get(i));
            }
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getBoolean(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean checkDisable(String query, ArrayList<String> para) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            for (int i = 0; i < para.size(); i++) {
                pst.setString(i + 1, para.get(i));
            }
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getBoolean(4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Verify the account
    @Override
    public boolean checkAccount(String query, ArrayList<String> para) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            for (int i = 0; i < para.size(); i++) {
                pst.setString(i + 1, para.get(i));
            }
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Status = 1 that account is being logged in and = 0 is not
    @Override
    public void updateStatus(boolean status, String username) {
        PreparedStatement pst;
        String queryUpdate = "Update account set trang_thai = ? where username =?";
        try {
            pst = con.prepareStatement(queryUpdate);

            pst.setBoolean(1, status);
            pst.setString(2, username);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Change password
    @Override
    public void updatePassword(String query, String username, String old_password, String new_password) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);

            pst.setString(1, new_password);
            pst.setString(2, username);
            pst.setString(3, old_password);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Get name from username
    @Override
    public String getName(String query, String username) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getJob(String query, String username) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    

    @Override
    public ArrayList<Account> loadAllAccount() {
        PreparedStatement pst;
        String query = "select * from account";
        String queryGetName = "select a.hoten from nhanvien a, account b where a.username = b.username and b.username =?";
        String queryGetJob = "select a.chucvu from nhanvien a, account b where a.username = b.username and b.username =?";
        ArrayList<Account> list = new ArrayList<>();
        Account account;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                account = new Account();
                account.setUsername(rs.getString(1));
                account.setIdEmployee(rs.getString(1));
                account.setName(getName(queryGetName, rs.getString(1)));
                account.setPosition(getJob(queryGetJob, rs.getString(1)));
                account.setStatus(rs.getBoolean(4));
                list.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void updateEnable(String username, boolean enable) {
        PreparedStatement pst;
        String query = "update account set vo_hieu_hoa = ? where username = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setBoolean(1, enable);
            pst.setString(2, username);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setDefaultPassword(String username) {
        PreparedStatement pst;
        String query = "Update account set user_password =? where username =?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, String.valueOf(username.hashCode()));
            pst.setString(2, username);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*===========================================FOR FILM MANAGEMENT==========================================*/
    //Create new film
    @Override
    public void insertPhim(Film film, String path) {
        PreparedStatement pst;
        String query = "insert into phim values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            pst = con.prepareStatement(query);

            pst.setString(1, film.getMaPhim());
            pst.setString(2, film.getTenPhim());
            pst.setBinaryStream(3, is, (int) file.length());
            pst.setString(4, film.getTheLoai());
            pst.setString(5, film.getQuocGia());
            pst.setString(6, film.getThoiLuong());
            pst.setDate(7, new Date(film.getKhoiChieu().getTime()));
            pst.setString(8, film.getNgonNgu());
            pst.setString(9, film.getDaoDien());
            pst.setString(10, film.getNhaSanXuat());
            pst.setString(11, film.getDienVienChinh());
            pst.setString(12, film.getNoiDung());
            pst.setString(13, film.getMaNhan());
            pst.setString(14, film.getTinhTrang());

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //List all phim from database
    @Override
    public ArrayList<Film> loadAllPhim() {
        PreparedStatement pst;
        String query = "select ma_phim, tenphim, the_loai, quoc_gia, thoi_luong, khoi_chieu, ngon_ngu, dao_dien, nha_san_xuat, dien_vien_chinh, noidung, ma_nhan, tinh_trang from phim order by tenphim";
        ArrayList<Film> lstFilm = new ArrayList<>();
        Film film;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                film = new Film();
                film.setMaPhim(rs.getString("ma_phim"));
                film.setTenPhim(rs.getString("tenphim"));
                film.setTheLoai(rs.getString("the_loai"));
                film.setQuocGia(rs.getString("quoc_gia"));
                film.setThoiLuong(rs.getString("thoi_luong"));
                film.setKhoiChieu(rs.getDate("khoi_chieu"));
                film.setNgonNgu(rs.getString("ngon_ngu"));
                film.setDaoDien(rs.getString("dao_dien"));
                film.setNhaSanXuat(rs.getString("nha_san_xuat"));
                film.setDienVienChinh(rs.getString("dien_vien_chinh"));
                film.setNoiDung(rs.getString("noidung"));
                film.setMaNhan(rs.getString("ma_nhan"));
                film.setTinhTrang(rs.getString("tinh_trang"));
                lstFilm.add(film);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstFilm;
    }

    //Get image belongs to film
    @Override
    public Blob getImageByID(String query) {
        PreparedStatement pst;
        Blob img;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                img = rs.getBlob("anh_dai_dien");
                return img;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Update film with path of avatar
    @Override
    public void updatePhim(Film film, String path) {
        PreparedStatement pst;
        String query = "update phim set tenphim = ?, anh_dai_dien = ?, the_loai = ?, quoc_gia = ?, "
                + "thoi_luong = ?, khoi_chieu = ?, ngon_ngu = ?, dao_dien = ?, nha_san_xuat = ?, "
                + "dien_vien_chinh = ?, noidung = ?, ma_nhan = ?, tinh_trang = ? where ma_phim = ?";
        try {
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            pst = con.prepareStatement(query);

            pst.setString(14, film.getMaPhim());
            pst.setString(1, film.getTenPhim());
            pst.setBinaryStream(2, is, (int) file.length());
            pst.setString(3, film.getTheLoai());
            pst.setString(4, film.getQuocGia());
            pst.setString(5, film.getThoiLuong());
            pst.setDate(6, new Date(film.getKhoiChieu().getTime()));
            pst.setString(7, film.getNgonNgu());
            pst.setString(8, film.getDaoDien());
            pst.setString(9, film.getNhaSanXuat());
            pst.setString(10, film.getDienVienChinh());
            pst.setString(11, film.getNoiDung());
            pst.setString(12, film.getMaNhan());
            pst.setString(13, film.getTinhTrang());

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Update film without path of avatar
    @Override
    public void updatePhim(Film film) {
        PreparedStatement pst;
        String query = "update phim set tenphim = ?, the_loai = ?, quoc_gia = ?, "
                + "thoi_luong = ?, khoi_chieu = ?, ngon_ngu = ?, dao_dien = ?, nha_san_xuat = ?, "
                + "dien_vien_chinh = ?, noidung = ?, ma_nhan = ?, tinh_trang = ? where ma_phim = ?";
        try {
            pst = con.prepareStatement(query);

            pst.setString(13, film.getMaPhim());
            pst.setString(1, film.getTenPhim());
            pst.setString(2, film.getTheLoai());
            pst.setString(3, film.getQuocGia());
            pst.setString(4, film.getThoiLuong());
            pst.setDate(5, new Date(film.getKhoiChieu().getTime()));
            pst.setString(6, film.getNgonNgu());
            pst.setString(7, film.getDaoDien());
            pst.setString(8, film.getNhaSanXuat());
            pst.setString(9, film.getDienVienChinh());
            pst.setString(10, film.getNoiDung());
            pst.setString(11, film.getMaNhan());
            pst.setString(12, film.getTinhTrang());

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Insert format film
    @Override
    public void insertFormatFilm(String idFilm, String idDinhDang) {
        PreparedStatement pst;
        String query = "insert into phim_dinhdang values(?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idFilm);
            pst.setString(2, idDinhDang);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<FilmFormat> loadAllFilmFormat() {
        PreparedStatement pst;
        ArrayList<FilmFormat> list = new ArrayList<>();
        String query = "select a.ma_phim, b.tenphim, a.ma_dinh_dang from phim_dinhdang a, phim b where a.ma_phim = b.ma_phim order by a.ma_dinh_dang";
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new FilmFormat(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public boolean checkFormat(String idFilm, String idDinhDang) {
        PreparedStatement pst;
        String query = "select * from phim_dinhdang where ma_phim = ? and ma_dinh_dang = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idFilm);
            pst.setString(2, idDinhDang);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void deleteFormatFilm(String idFilm, String idDinhDang) {
        PreparedStatement pst;
        String query = "delete from phim_dinhdang where ma_phim = ? and ma_dinh_dang = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idFilm);
            pst.setString(2, idDinhDang);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*===========================================FOR SHOWTIME MANAGEMENT==========================================*/
    @Override
    public void insertKTG(KTG ktg) {
        PreparedStatement pst;
        String query = "insert into KTG values(?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, ktg.getIdKTG());
            pst.setDate(2, new Date(ktg.getDate().getTime()));
            pst.setString(3, ktg.getTime());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<KTG> loadAllKTG() {
        PreparedStatement pst;
        ArrayList<KTG> list = new ArrayList<>();
        String query = "select * from KTG order by ngay_chieu, gio_chieu";
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new KTG(rs.getString(1), rs.getDate(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void deleteKTG(String idKTG) {
        PreparedStatement pst;
        String query = "delete from KTG where ma_ktg = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idKTG);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertShowTime(ShowTime showtime) {
        PreparedStatement pst;
        String query = "insert into lichchieu values(?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, showtime.getIdKTG());
            pst.setString(2, showtime.getIdFilm());
            pst.setString(3, showtime.getIdRoom());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<ShowTime> loadAllShowTime() {
        PreparedStatement pst;
        ArrayList<ShowTime> list = new ArrayList<>();
        String query = "select e.ma_ktg, b.ma_phim, f.ma_rap from lichchieu a, phim b, phim_dinhdang c, dinhdang d, ktg e, rap f "
                + "where a.ma_ktg = e.ma_ktg and a.ma_phim = b.ma_phim and a.ma_rap = f.ma_rap and b.ma_phim = c.ma_phim and d.ma_dinh_dang = c.ma_dinh_dang and d.ma_dinh_dang = f.ma_dinh_dang order by f.ma_rap";
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new ShowTime(rs.getString(1), rs.getString(2), findNameFilmByID(rs.getString(2)), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public String findNameFilmByID(String id) {
        PreparedStatement pst;
        String query = "select tenphim from phim where ma_phim = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<ShowTimeMovie> loadAllShowTimeMovie() {
        PreparedStatement pst;
        ArrayList<ShowTimeMovie> list = new ArrayList<>();
        String query = "select b.ma_phim, b.tenphim, b.thoi_luong, d.ma_dinh_dang, e.ngay_chieu, e.gio_chieu, f.ma_rap, b.ma_nhan, e.ma_ktg "
                + "from lichchieu a, phim b, phim_dinhdang c, dinhdang d, ktg e, rap f "
                + "where a.ma_ktg = e.ma_ktg and a.ma_phim = b.ma_phim and a.ma_rap = f.ma_rap and b.ma_phim = c.ma_phim and d.ma_dinh_dang = c.ma_dinh_dang and d.ma_dinh_dang = f.ma_dinh_dang and b.tinh_trang <> N'Đã chiếu' order by e.ngay_chieu, e.gio_chieu";
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new ShowTimeMovie(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void updateShowTime(ShowTime showtime_old, ShowTime showtime_new) {
        PreparedStatement pst;
        String query = "update lichchieu set ma_phim = ?, ma_rap = ? where ma_ktg = ? and ma_phim = ? and ma_rap = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, showtime_new.getIdFilm());
            pst.setString(2, showtime_new.getIdRoom());
            pst.setString(3, showtime_old.getIdKTG());
            pst.setString(4, showtime_old.getIdFilm());
            pst.setString(5, showtime_old.getIdRoom());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean checkKTG(java.util.Date date, String time) {
        PreparedStatement pst;
        String query = "select * from KTG where ngay_chieu = ? and gio_chieu = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setDate(1, new Date(date.getTime()));
            pst.setString(2, time);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean checkShowTime(String idKTG, String idFilm, String idRoom) {
        PreparedStatement pst;
        String query = "select * from lichchieu where ma_ktg = ? and ma_phim = ? and ma_rap = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idKTG);
            pst.setString(2, idFilm);
            pst.setString(3, idRoom);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /*===========================================FOR EMPLOYEE MANAGEMENT==========================================*/
    @Override
    public void insertEmployee(Employee nv) {
        PreparedStatement pst;
        String query = "insert into nhanvien values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, nv.getIdEmployee());
            pst.setString(2, nv.getNameEmployee());
            pst.setDate(3, new Date(nv.getBirth().getTime()));
            pst.setString(4, nv.getGender());
            pst.setString(5, nv.getEmail());
            pst.setString(6, nv.getPhone());
            pst.setString(7, nv.getAddress());
            pst.setString(8, nv.getStatus());
            pst.setString(9, nv.getUsername());
            pst.setString(10, nv.getJob());
            pst.setDate(11, new Date(nv.getAddmission().getTime()));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateEmployee(Employee nv) {
        PreparedStatement pst;
        String query = "update nhanvien set hoten = ?, ngaysinh = ?, gioitinh = ?, email = ?, "
                + "sdt = ?, diachi= ?, trangthai = ?, username = ?, chucvu = ?, admission = ? "
                + "where ma_nhan_vien = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(11, nv.getIdEmployee());
            pst.setString(1, nv.getNameEmployee());
            pst.setDate(2, new Date(nv.getBirth().getTime()));
            pst.setString(3, nv.getGender());
            pst.setString(4, nv.getEmail());
            pst.setString(5, nv.getPhone());
            pst.setString(6, nv.getAddress());
            pst.setString(7, nv.getStatus());
            pst.setString(8, nv.getUsername());
            pst.setString(9, nv.getJob());
            pst.setDate(10, new Date(nv.getAddmission().getTime()));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Employee> loadAllEmployee() {
        PreparedStatement pst;
        String query = "select * from nhanvien";
        ArrayList<Employee> list = new ArrayList<>();
        Employee nv;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nv = new Employee();
                nv.setStt(rs.getInt(1));
                nv.setIdEmployee(rs.getString(2));
                nv.setNameEmployee(rs.getString(3));
                nv.setBirth(rs.getDate(4));
                nv.setGender(rs.getString(5));
                nv.setEmail(rs.getString(6));
                nv.setPhone(rs.getString(7));
                nv.setAddress(rs.getString(8));
                nv.setStatus(rs.getString(9));
                nv.setUsername(rs.getString(10));
                nv.setJob(rs.getString(11));
                nv.setAddmission(rs.getDate(12));
                list.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void insertAccount(String idEmployee) {
        PreparedStatement pst;
        String query = "insert into account values (?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idEmployee);
            pst.setString(2, String.valueOf(idEmployee.hashCode()));
            pst.setBoolean(3, false);
            pst.setBoolean(4, false);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*===========================================FOR MEMBER MANAGEMENT==========================================*/
    @Override
    public void insertMember(Member member) {
        PreparedStatement pst;
        String query = "insert into thanhvien values (?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, member.getIdMember());
            pst.setString(2, member.getNameMember());
            pst.setDate(3, new Date(member.getBirth().getTime()));
            pst.setString(4, member.getGender());
            pst.setString(5, member.getEmail());
            pst.setString(6, member.getPhone());
            pst.setString(7, member.getAddress());
            pst.setString(8, member.getType());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateMember(Member member) {
        PreparedStatement pst;
        String query = "update thanhvien set hoten = ?, ngaysinh = ?, gioitinh = ?, email = ?, "
                + "sdt = ?, diachi= ?, loai = ? "
                + "where ma_thanh_vien = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(8, member.getIdMember());
            pst.setString(1, member.getNameMember());
            pst.setDate(2, new Date(member.getBirth().getTime()));
            pst.setString(3, member.getGender());
            pst.setString(4, member.getEmail());
            pst.setString(5, member.getPhone());
            pst.setString(6, member.getAddress());
            pst.setString(7, member.getType());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Member> loadAllMember() {
        PreparedStatement pst;
        String query = "select * from thanhvien order by stt";
        ArrayList<Member> list = new ArrayList<>();
        Member member;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                member = new Member();
                member.setStt(rs.getInt(1));
                member.setIdMember(rs.getString(2));
                member.setNameMember(rs.getString(3));
                member.setBirth(rs.getDate(4));
                member.setGender(rs.getString(5));
                member.setEmail(rs.getString(6));
                member.setPhone(rs.getString(7));
                member.setAddress(rs.getString(8));
                member.setType(rs.getString(9));
                list.add(member);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    /*===========================================FOR TICKET MANAGEMENT==========================================*/
    @Override
    public ArrayList<Ticket> loadAllTicket() {
        PreparedStatement pst;
        String query = "select * from ve order by ma_rap";
        ArrayList<Ticket> list = new ArrayList<>();
        Ticket ticket;
        KTG ktg;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ticket = new Ticket();
                ticket.setIdTicket(rs.getString(1));
                ticket.setIdFilm(rs.getString(2));
                ticket.setNameFilm(findNameFilmByID(rs.getString(2)));
                ticket.setRoom(rs.getString(3));
                ticket.setSeat(rs.getString(4));
                ktg = findKTG(rs.getString(5));
                ticket.setDate(ktg.getDate());
                ticket.setTime(ktg.getTime());
                ticket.setTotal(findPrice(rs.getString(6)));
                list.add(ticket);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public KTG findKTG(String idKTG) {
        PreparedStatement pst;
        KTG ktg;
        String query = "select * from KTG where ma_ktg = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idKTG);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ktg = new KTG(rs.getString(1), rs.getDate(2), rs.getString(3));
                return ktg;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int findPrice(String idPrice) {
        PreparedStatement pst;
        String query = "select dongia from gia where ma_gia = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idPrice);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<String> loadAllSeat(String idFilm, String idRoom, String idKTG) {
        PreparedStatement pst;
        String query = "select ma_ghe from ve where ma_phim = ? and ma_rap = ? and ma_ktg = ? order by ma_ghe";
        ArrayList<String> list = new ArrayList<>();
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idFilm);
            pst.setString(2, idRoom);
            pst.setString(3, idKTG);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void insertTicket(Ticket ticket) {
        PreparedStatement pst;
        String query = "insert into ve values (?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, ticket.getIdTicket());
            pst.setString(2, ticket.getIdFilm());
            pst.setString(3, ticket.getRoom());
            pst.setString(4, ticket.getSeat());
            pst.setString(5, ticket.getIdKTG());
            pst.setString(6, ticket.getIdPrice());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertDSTicket(String idTicket, String idMember, String idEmployee, java.util.Date datecreated) {
        PreparedStatement pst;
        String query = "insert into ds_ve_dat values (?,?,?,?)";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idTicket);
            pst.setString(2, idMember);
            pst.setString(3, idEmployee);
            pst.setDate(4, new Date(datecreated.getTime()));
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getTotalByIDMember(String idMember) {
        PreparedStatement pst;
        String query = "select a.ma_thanh_vien, sum(c.dongia) as ThanhTien "
                + "from ds_ve_dat a, ve b, gia c "
                + "where a.ma_thanh_vien = ? and a.ma_ve = b.ma_ve and b.ma_gia = c.ma_gia group by a.ma_thanh_vien";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idMember);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getInt(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<Bill> loadAllBill() {
        PreparedStatement pst;
        String query = "select * from ds_ve_dat order by ngay_lap";
        ArrayList<Bill> list = new ArrayList<>();
        Bill bill;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                bill = new Bill();
                bill.setIdTicket(rs.getString(1));
                bill.setIdMember(rs.getString(2));
                bill.setNameMember(findNameMemberByID(rs.getString(2)));
                bill.setIdEmployee(rs.getString(3));
                bill.setNameEmployee(findNameEmployeeByID(rs.getString(3)));
                bill.setDatecreated(rs.getDate(4));
                bill.setPrice(getPriceBill(rs.getString(1)));
                list.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public String findNameMemberByID(String idMember) {
        PreparedStatement pst;
        String query = "select hoten from thanhvien where ma_thanh_vien = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idMember);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String findNameEmployeeByID(String idEmployee) {
        PreparedStatement pst;
        String query = "select hoten from nhanvien where ma_nhan_vien = ?";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idEmployee);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int getPriceBill(String idTicket) {
        PreparedStatement pst;
        String query = "select c.dongia from ds_ve_dat a, ve b, gia c where a.ma_ve = ? and a.ma_ve = b.ma_ve and b.ma_gia = c.ma_gia";
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, idTicket);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
