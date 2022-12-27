/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author duynh
 */
public class Author {
    private int aid;
    private String name;
    private Date dob;
    private boolean gender;
    private Type tid;
    private Account order_by;

    public Author() {
    }

    public Author(int aid, String name, Date dob, boolean gender, Type tid, Account order_by) {
        this.aid = aid;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.tid = tid;
        this.order_by = order_by;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Type getTid() {
        return tid;
    }

    public void setTid(Type tid) {
        this.tid = tid;
    }

    public Account getOrder_by() {
        return order_by;
    }

    public void setOrder_by(Account order_by) {
        this.order_by = order_by;
    }
    
    
}
