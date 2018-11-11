/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HAU
 */
public class ShowTime {
    private String idKTG;
    private String idFilm;
    private String nameFilm;
    private String idRoom;

    public ShowTime() {
    }

    public ShowTime(String idKTG, String idFilm, String nameFilm, String idRoom) {
        this.idKTG = idKTG;
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.idRoom = idRoom;
    }

    public String getIdKTG() {
        return idKTG;
    }

    public void setIdKTG(String idKTG) {
        this.idKTG = idKTG;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "ShowTime{" + "idKTG=" + idKTG + ", idFilm=" + idFilm + ", nameFilm=" + nameFilm + ", idRoom=" + idRoom + '}';
    }
    
}
