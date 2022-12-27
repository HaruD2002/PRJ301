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
public class dbcontext {
    protected Connection connection;
    public dbcontext() {

        try {
            String user = "duynhd";
            String pass = "1";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=lab1";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dbcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
