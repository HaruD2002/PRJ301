/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author duynh
 */
public class Student {
    int Id;
    String Name;
    boolean Gender;
    Date Dob ;

    public Student() {
    }

    public Student(int Id, String Name, boolean Gender, Date Dob) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.Dob = Dob;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

  
}
