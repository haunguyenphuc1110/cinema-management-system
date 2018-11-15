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
public class Ticket {
    private String idTicket;
    private String idFilm;
    private String nameFilm;
    private String room;
    private String seat;
    private Date date;
    private String time;
    private int total;

    public Ticket() {
    }

    public Ticket(String idTicket, String idFilm, String nameFilm, String room, String seat, Date date, String time, int total) {
        this.idTicket = idTicket;
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.room = room;
        this.seat = seat;
        this.date = date;
        this.time = time;
        this.total = total;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", idFilm=" + idFilm + ", nameFilm=" + nameFilm + ", room=" + room + ", seat=" + seat + ", date=" + date + ", time=" + time + ", total=" + total + '}';
    }
    
    
}