/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
    
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
public abstract class BaseDAO<T> {
   protected Connection connection;
   public BaseDAO()
   {
       try {
           String user = "sa";
           String pass = "123456";
           //String url = "jdbc:sqlserver://localhost:1433;databaseName=testStudent";
           
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost:1433;databaseName=PRJ301_PE_SP_2022_B1";
           
           connection = DriverManager.getConnection(url, user, pass);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DAO.BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public abstract ArrayList<T> getAll();
   
}
    
