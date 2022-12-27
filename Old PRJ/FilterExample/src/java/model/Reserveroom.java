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
public class Reserveroom extends BaseModel{

    private Customer cusid;
    private Room rid;
    private Date from;
    private Date to;
    private Account userid;

    public Customer getCusid() {
        return cusid;
    }

    public void setCusid(Customer cusid) {
        this.cusid = cusid;
    }

    public Room getRid() {
        return rid;
    }

    public void setRid(Room rid) {
        this.rid = rid;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Account getUserid() {
        return userid;
    }

    public void setUserid(Account userid) {
        this.userid = userid;
    }
    
    
}
