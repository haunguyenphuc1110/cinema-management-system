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
public class ShowTimeMovie {
    private String idFilm;
    private String nameFilm;
    private String duration;
    private String format;
    private Date date;
    private String time;
    private String room;
    private String label;

    public ShowTimeMovie() {
    }

    public ShowTimeMovie(String idFilm, String nameFilm, String duration, String format, Date date, String time, String room, String label) {
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.duration = duration;
        this.format = format;
        this.date = date;
        this.time = time;
        this.room = room;
        this.label = label;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "ShowTimeMovie{" + "idFilm=" + idFilm + ", nameFilm=" + nameFilm + ", duration=" + duration + ", format=" + format + ", date=" + date + ", time=" + time + ", room=" + room + ", label=" + label + '}';
    }
    
    
}
