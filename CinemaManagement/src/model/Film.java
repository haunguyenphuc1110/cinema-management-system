/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author HAU
 */
public class Film {

    private String maPhim;
    private String tenPhim;
    private String theLoai;
    private String quocGia;
    private String thoiLuong;
    private Date khoiChieu;
    private String ngonNgu;
    private String daoDien;
    private String nhaSanXuat;
    private String dienVienChinh;
    private String noiDung;
    private String maNhan;
    private String tinhTrang;

    public Film() {
    }

    public Film(String maPhim, String tenPhim, String theLoai, String quocGia, String thoiLuong, Date khoiChieu, String ngonNgu, String daoDien, String nhaSanXuat, String dienVienChinh, String noiDung, String maNhan, String tinhTrang) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.quocGia = quocGia;
        this.thoiLuong = thoiLuong;
        this.khoiChieu = khoiChieu;
        this.ngonNgu = ngonNgu;
        this.daoDien = daoDien;
        this.nhaSanXuat = nhaSanXuat;
        this.dienVienChinh = dienVienChinh;
        this.noiDung = noiDung;
        this.maNhan = maNhan;
        this.tinhTrang = tinhTrang;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public Date getKhoiChieu() {
        return khoiChieu;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public String getDienVienChinh() {
        return dienVienChinh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getMaNhan() {
        return maNhan;
    }
    
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public void setKhoiChieu(Date khoiChieu) {
        this.khoiChieu = khoiChieu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setDienVienChinh(String dienVienChinh) {
        this.dienVienChinh = dienVienChinh;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setMaNhan(String maNhan) {
        this.maNhan = maNhan;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "Film{" + "maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", theLoai=" + theLoai + ", quocGia=" + quocGia + ", thoiLuong=" + thoiLuong + ", khoiChieu=" + khoiChieu + ", ngonNgu=" + ngonNgu + ", daoDien=" + daoDien + ", nhaSanXuat=" + nhaSanXuat + ", dienVienChinh=" + dienVienChinh + ", noiDung=" + noiDung + ", maNhan=" + maNhan + ", tinhTrang=" + tinhTrang + '}';
    }

}
