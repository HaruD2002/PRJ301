/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author duynh
 */
public class sqlconnector {
 private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=mylogin";
 private static final String User = "sa";
 private static final String Pass = "123456";
 
 public static Connection connectSQL() throws SQLException, ClassNotFoundException{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     Connection conn = DriverManager.getConnection(DB_URL, User, Pass);
     
     return conn;
 }
}
