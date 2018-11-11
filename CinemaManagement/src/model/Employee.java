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
public class Employee {
    private String idEmployee;
    private String nameEmployee;
    private Date birth;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String status;
    private String username;
    private String job;
    private Date addmission;

    public Employee() {
    }

    public Employee(String idEmployee, String nameEmployee, Date birth, String gender, String email, String phone, String address, String status, String username, String job, Date addmission) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.username = username;
        this.job = job;
        this.addmission = addmission;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getAddmission() {
        return addmission;
    }

    public void setAddmission(Date addmission) {
        this.addmission = addmission;
    }

    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + idEmployee + ", nameEmployee=" + nameEmployee + ", birth=" + birth + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address + ", status=" + status + ", username=" + username + ", job=" + job + ", addmission=" + addmission + '}';
    }
    
    
}
