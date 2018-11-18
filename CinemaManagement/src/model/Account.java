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
public class Account {

    private String username;
    private String idEmployee;
    private String name;
    private boolean status;

    public Account() {
    }

    public Account(String username, String idEmployee, String name, boolean status) {
        this.username = username;
        this.idEmployee = idEmployee;
        this.name = name;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", idEmployee=" + idEmployee + ", name=" + name + ", status=" + status + '}';
    }

}
