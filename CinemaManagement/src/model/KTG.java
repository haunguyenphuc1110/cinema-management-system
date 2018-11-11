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
public class KTG{ 
    private String idKTG;
    private Date date;
    private String time;

    public KTG() {
    }

    public KTG(String idKTG, Date date, String time) {
        this.idKTG = idKTG;
        this.date = date;
        this.time = time;
    }
            

    public String getIdKTG() {
        return idKTG;
    } 

    public void setIdKTG(String idKTG) {
        this.idKTG = idKTG;
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

    @Override
    public String toString() {
        return "KTG{" + "idKTG=" + idKTG + ", date=" + date + ", time=" + time + '}';
    }

    
}
