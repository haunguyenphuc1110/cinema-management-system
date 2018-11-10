/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Blob;
import java.sql.Connection;
import java.util.ArrayList;
import model.Film;
import model.FilmFormat;
import model.KTG;
import model.ShowTime;
/**
 *
 * @author HAU
 */
public interface QueryInterface {
    //Check Status of user to prevent from logging in twice
    boolean checkStatus(String query, ArrayList<String> para);
    
    //Verify the account is exist
    boolean checkAccount(String query, ArrayList<String> para);
    
    //Status = 1 that account is logging in and = 0 is not
    void updateStatus(String query, ArrayList<String> para);
    
    void updatePassword(String query, String username, String old_password, String new_password);
    
    //Get name from username
    String getName(String query, String username);
    
    //Create new film
    void insertPhim(Film film, String path);
    
    //List all phim from database
    ArrayList<Film> loadAllPhim(String query);
    
    //Get image by film's id from database
    Blob getImageByID(String query);
    
    //Update film
    void updatePhim(Film film, String path);
    void updatePhim(Film film);
    
    //Create 2D, 3D or 4D movies
    void insertFormatFilm(String idFilm, String idDinhDang);
    
    //Load all format films
    ArrayList<FilmFormat> loadAllFilmFormat();
    
    //Check format film
    boolean checkFormat(String idFilm, String idDinhDang);
    
    //Delete format film
    void deleteFormatFilm(String idFilm, String idDinhDang);
    
    //Create showtime
    void insertKTG(KTG ktg);
    //Load all KTG
    ArrayList<KTG> loadAllKTG();
    
    //Create show time
    void insertShowTime(ShowTime showtime);
    //Load all show time
    ArrayList<ShowTime> loadAllShowTime();
    String findNameFilmByID(String id);
    //ArrayList<ShowTime> loadAllShowTimeMovie();
     
}
