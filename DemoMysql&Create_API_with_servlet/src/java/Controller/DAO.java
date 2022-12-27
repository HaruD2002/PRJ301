/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author duynh
 */
public class DAO {

    private String user = "root";
    private String password = "1234";
    private Connection con;
    private String url = "jdbc:mysql://localhost/DemoMysql";
    String sql = "CREATE DATABASE IF NOT EXISTS DemoMysql";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement stm = con.prepareStatement(sql);
            stm.execute();
            System.out.println("Create success" + con);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        DAO db = new DAO();
        System.out.println(db.getConnection());
    }
    
    

}
