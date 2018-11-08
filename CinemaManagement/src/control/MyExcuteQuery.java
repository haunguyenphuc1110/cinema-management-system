/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

/**
 *
 * @author HAU
 */
public class MyExcuteQuery {

    //Check Status of user to prevent from logging in twice
    public boolean checkStatus(Connection con, String query, ArrayList<String> para) {
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Verify the account
    public boolean checkAccount(Connection con, String query, ArrayList<String> para) {
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    public void updateStatus(Connection con, String query, ArrayList<String> para) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);

            pst.setString(1, para.get(0));
            pst.setString(2, para.get(1));

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePassword(Connection con, String query, String username, String old_password, String new_password) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);

            pst.setString(1, new_password);
            pst.setString(2, username);
            pst.setString(3, old_password);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName(Connection con, String query, String username) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insertPhim(Connection con, String query, Film film, String path) {
        PreparedStatement pst;
        try {
            File file=new File(path); 
            FileInputStream is=new FileInputStream(file);
            pst = con.prepareStatement(query);

            pst.setString(1, film.getMaPhim());
            pst.setString(2, film.getTenPhim());
            pst.setBinaryStream(3, is, (int)file.length());
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
    
    public ArrayList<Film> loadAllPhim(Connection con, String query) {
        PreparedStatement pst;
        ArrayList<Film> lstFilm = new ArrayList<>();
        Film film;
        try {
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                film = new Film(rs.getString("ma_phim"),rs.getString("tenphim"),rs.getString("the_loai"),
                rs.getString("quoc_gia"),rs.getString("thoi_luong"),rs.getDate("khoi_chieu"),
                rs.getString("ngon_ngu"),rs.getString("dao_dien"),rs.getString("nha_san_xuat"),
                rs.getString("dien_vien_chinh"),rs.getString("noidung"),rs.getString("ma_nhan"),rs.getString("tinh_trang"));
                lstFilm.add(film);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstFilm;
    }
}
