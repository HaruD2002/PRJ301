/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author duynh
 */
public class sqlconnector {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=lab6";
    private static final String User  = "sa";
    private static final String Pass = "123456";
    public static Connection connectDatabase() throws ClassNotFoundException, SQLException{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     Connection con = DriverManager.getConnection(DB_URL, User, Pass);
        return con;
    }
}
