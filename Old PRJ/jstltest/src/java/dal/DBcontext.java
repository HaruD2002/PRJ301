/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BaseModel;

/**
 *
 * @author duynh
 * @param <T>
 */
public abstract class DBcontext<T extends BaseModel> {

    protected Connection connection;

    public DBcontext() {
        try {
            String user = "duynhd";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Test";            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url,user,pass);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public abstract ArrayList<T> List();
    public abstract void insert(T Model);
    public abstract void update(T Model);
    public abstract void delete(T Model);

}
