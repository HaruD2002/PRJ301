/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import Model.BaseModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
public abstract class BaseDal <T extends BaseModel> {
    protected Connection connection;

    public BaseDal() {
        try {
            String user = "duynhd";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ztest2";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public abstract ArrayList<T> list();
}
