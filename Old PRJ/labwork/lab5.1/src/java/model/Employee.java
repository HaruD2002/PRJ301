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
public class Employee {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int zip;

    public Employee() {
    }

    public Employee(String FirstName, String LastName, String Address, String City, int zip) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.City = City;
        this.zip = zip;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public static ArrayList<Employee> newEmployee(){
        ArrayList<Employee> myEmployee = new ArrayList<>();
        myEmployee.add(new Employee("A", "B","This Street", "This L City", 12345));
        myEmployee.add(new Employee("C", "D","That Street", "That T CIty", 54321));
        myEmployee.add(new Employee("E", "F","Our Street", "Mine City", 111111));
                
        return myEmployee;
    }
    
    
}
