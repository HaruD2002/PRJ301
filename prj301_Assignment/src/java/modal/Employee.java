/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author duynh
 */
public class Employee {

    private int empid;
    private String empname;
    private boolean gender;
    private Team currenteam;
    private ArrayList<TimeSheet> timesheet;

    public Team getCurrenteam() {
        return currenteam;
    }

    public void setCurrenteam(Team currenteam) {
        this.currenteam = currenteam;
    }

    public ArrayList<TimeSheet> getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(ArrayList<TimeSheet> timesheet) {
        this.timesheet = timesheet;
    }

    public Employee() {
        this.timesheet = new ArrayList<>();
    }

    public Employee(int empid, String empname, boolean gender) {
        this.timesheet = new ArrayList<>();
        this.empid = empid;
        this.empname = empname;
        this.gender = gender;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
