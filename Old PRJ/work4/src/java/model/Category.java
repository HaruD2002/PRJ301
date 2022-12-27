/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duynh
 */
public class Category extends BaseModel{
    private int cateid;
    private String catrname;

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getCatrname() {
        return catrname;
    }

    public void setCatrname(String catrname) {
        this.catrname = catrname;
    }
    
    
}
