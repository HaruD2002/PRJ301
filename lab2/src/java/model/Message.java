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
public class Message {
    private int id;
    private String title;
    private Date createdDate;
    private Account create_by;

    public Message() {
    }

    public Message(int id, String title, Date createdDate, Account create_by) {
        this.id = id;
        this.title = title;
        this.createdDate = createdDate;
        this.create_by = create_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Account getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Account create_by) {
        this.create_by = create_by;
    }
    
    
    
}
