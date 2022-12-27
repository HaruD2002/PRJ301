/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;

/**
 *
 * @author duynh
 */
public class User {
    String id;
    String fname;
    String lnamne;
    int gender;
    Date DOB;
    String email;
    String pass;

    public User() {
    }

    public User(String id, String fname, String lnamne, int gender, Date DOB, String email, String pass) {
        this.id = id;
        this.fname = fname;
        this.lnamne = lnamne;
        this.gender = gender;
        this.DOB = DOB;
        this.email = email;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLnamne() {
        return lnamne;
    }

    public void setLnamne(String lnamne) {
        this.lnamne = lnamne;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    

    
    
}
