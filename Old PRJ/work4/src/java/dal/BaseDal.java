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
import model.BaseModel;

/**
 *
 * @author duynh
 */
public abstract class BaseDal {

    protected Connection connection;

    public BaseDal() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "duynhd";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=shop";          
            connection = DriverManager.getConnection(url, user, pass);


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
