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
import views.Login;
import model.Film;
import model.FilmFormat;
import model.KTG;
import model.ShowTime;

/**
 *
 * @author HAU
 */
public class MyExcuteQuery implements QueryInterface {

    static Connection con;
    public MyExcuteQuery(){
        con = MyConnection.getConnection();
    }
    //Check Status of user to prevent from logging in twice
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

    //Verify the account is exist
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

    //Status = 1 that account is logging in and = 0 is not
    @Override
    public void updateStatus(String query, ArrayList<String> para) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);

            pst.setString(1, para.get(0));
            pst.setString(2, para.get(1));
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
    public ArrayList<Film> loadAllPhim(String query) {
        PreparedStatement pst;
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

    //Update film
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
        String query = "select a.ma_phim, b.tenphim, a.ma_dinh_dang from phim_dinhdang a, phim b where a.ma_phim = b.ma_phim";
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
            
            if(rs.next()){
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
        String query = "select * from KTG";
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
        String query = "select * from lichchieu";
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new ShowTime(rs.getString(1), rs.getString(2), rs.getString(3)));
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
            if(rs.next())
                return rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(MyExcuteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    

}
