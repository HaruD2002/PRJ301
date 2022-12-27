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
public class Exercise {
    private int eid;
    private String content;
    private Date createed_date;
    private String created_by;

    public Exercise() {
    }

    public Exercise(int eid, String content, Date createed_date, String created_by) {
        this.eid = eid;
        this.content = content;
        this.createed_date = createed_date;
        this.created_by = created_by;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateed_date() {
        return createed_date;
    }

    public void setCreateed_date(Date createed_date) {
        this.createed_date = createed_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
    
    
}
