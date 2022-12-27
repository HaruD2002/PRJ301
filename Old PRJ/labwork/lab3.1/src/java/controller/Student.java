package controller;

import java.util.ArrayList;
import controller.sqlconnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duynh
 */
public class Student {

    int id;
    String name;
    boolean gender;
    String DOB;

    public Student() {
    }

    public Student(int id, String name, boolean gender, String DOB) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public static ArrayList<Student> myData() throws SQLException, ClassNotFoundException {

        Connection con = sqlconnect.connectSQL();

        Statement mystatement = con.createStatement();

        String findStudent = "Select * from Student";

        ResultSet displayStudent = mystatement.executeQuery(findStudent);

        ArrayList<Student> data = new ArrayList<>();

        while (displayStudent.next()) {
            Student myStudent = new Student(displayStudent.getInt("id"), displayStudent.getString("name"), displayStudent.getBoolean("gender"), displayStudent.getString("dob"));
            data.add(myStudent);
        }

        return data;
    }

    public static void addStudent(String student, boolean gender, String DOB) throws SQLException, ClassNotFoundException {
        Connection con = sqlconnect.connectSQL();
        Statement newStudent = con.createStatement();
        newStudent.executeQuery("insert into Student(name,gender,dob) values ("+ "'" +student+ "'" + "'" + gender + "'" + "'" + DOB + "'" + ")");
    }

}
