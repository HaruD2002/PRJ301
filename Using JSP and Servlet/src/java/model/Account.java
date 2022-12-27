/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sonnt
 */
public class Account {
    private String username;
    private String password;
    private String email;
    private Date DOB;
    private String phone;

    public Account() {
    }

    public Account(String username, String password, String email, Date DOB, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.DOB = DOB;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + ", password=" + password + ", email=" + email + ", DOB=" + DOB + ", phone=" + phone + '}';
    }

    
}
