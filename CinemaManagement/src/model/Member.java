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
public class Member {

    private int stt;
    private String idMember;
    private String nameMember;
    private Date birth;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String type;

    public Member() {
    }

    public Member(int stt, String idMember, String nameMember, Date birth, String gender, String email, String phone, String address, String type) {
        this.stt = stt;
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.type = type;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Member{" + "stt=" + stt + ", idMember=" + idMember + ", nameMember=" + nameMember + ", birth=" + birth + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address + ", type=" + type + '}';
    }

    
}
