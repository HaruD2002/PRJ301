/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author duynh
 */
public class Name {
    String firstname;
    String lastname;

    public Name() {
    }

    public Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public static Name[] getString(){
            Name arr[];
            arr  = new Name[3];
            arr[0] = new Name("a","b");
            arr[1] = new Name("c","d");
            arr[2] = new Name("e","f");
            
            
            return arr;  
    }
    
    public static ArrayList<Name> getA(){
        ArrayList<Name> displayC = new ArrayList<>();
        displayC.add(new Name("a","b"));
        displayC.add(new Name("c","d"));
        displayC.add(new Name("e","f"));
        return displayC;
    }
}
