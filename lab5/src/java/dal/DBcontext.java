/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
public class DBcontext {

    protected Connection connection;
    String user = "duynhd";
    String password = "1";

    public DBcontext() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRJ321_SP2019";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
