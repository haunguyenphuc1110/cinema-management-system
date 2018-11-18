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
public class Bill {

    private String idTicket;
    private String idMember;
    private String nameMember;
    private String idEmployee;
    private String nameEmployee;
    private Date datecreated;
    private int price;

    public Bill() {
    }

    public Bill(String idTicket, String idMember, String nameMember, String idEmployee, String nameEmployee, Date datecreated, int price) {
        this.idTicket = idTicket;
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.datecreated = datecreated;
        this.price = price;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" + "idTicket=" + idTicket + ", idMember=" + idMember + ", nameMember=" + nameMember + ", idEmployee=" + idEmployee + ", nameEmployee=" + nameEmployee + ", datecreated=" + datecreated + ", price=" + price + '}';
    }

}
