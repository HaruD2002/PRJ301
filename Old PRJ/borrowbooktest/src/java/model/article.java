/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duynh
 */
public class article extends BaseModel{
    private int arid;
    private String arname;

    
    public int getArid() {
        return arid;
    }

    public void setArid(int arid) {
        this.arid = arid;
    }

    public String getArname() {
        return arname;
    }

    public void setArname(String arname) {
        this.arname = arname;
    }
    
    
}
