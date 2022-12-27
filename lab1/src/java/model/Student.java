/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duynh
 */
public class Student {
    private int sid;
    private String sname;
    private Department did;

    public Student(int sid, String sname, Department did) {
        this.sid = sid;
        this.sname = sname;
        this.did = did;
    }

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Department getDid() {
        return did;
    }

    public void setDid(Department did) {
        this.did = did;
    }
    
    
    
}
