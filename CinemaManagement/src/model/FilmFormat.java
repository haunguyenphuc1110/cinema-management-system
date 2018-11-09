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
public class FilmFormat {
    private String idFilm;
    private String name;
    private String idFormat;

    public FilmFormat() {
    }

    public FilmFormat(String idFilm, String name, String idFormat) {
        this.idFilm = idFilm;
        this.name = name;
        this.idFormat = idFormat;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(String idFormat) {
        this.idFormat = idFormat;
    }

    @Override
    public String toString() {
        return "FilmFormat{" + "idFilm=" + idFilm + ", name=" + name + ", idFormat=" + idFormat + '}';
    }

    
    
    
}
