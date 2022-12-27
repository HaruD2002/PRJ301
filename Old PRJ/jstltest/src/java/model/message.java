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
public class message extends BaseModel{
    int mid;
    String mcontent;
    Date mCreateDate;
    Account mFrom;
    Account mTo;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Date getmCreateDate() {
        return mCreateDate;
    }

    public void setmCreateDate(Date mCreateDate) {
        this.mCreateDate = mCreateDate;
    }

    public Account getmFrom() {
        return mFrom;
    }

    public void setmFrom(Account mFrom) {
        this.mFrom = mFrom;
    }

    public Account getmTo() {
        return mTo;
    }

    public void setmTo(Account mTo) {
        this.mTo = mTo;
    }
    
    
    
    
}
