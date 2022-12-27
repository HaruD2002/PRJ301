/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.testconection;

import java.sql.*;

/**
 *
 * @author duynh
 */
public class Testconection {

    public static void main(String args[]) {
        try {
            
            String user = "duynhd";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=test2";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, pass);
//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Account");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  ");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
