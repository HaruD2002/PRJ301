/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
public class myQueury extends SQLconnector {

    public static ArrayList<User> getAll() {
        ArrayList<User> getUserdata = new ArrayList<>();
        String get = "Select * from [User]";
        try {

            Connection con = SQLconnector.connectDatabase();
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery(get);
            while (rs.next()) {
                User current = new User();
                current.setId(rs.getString("id"));
                current.setFname(rs.getString("userfirstname"));
                current.setLnamne(rs.getString("userlastname"));
                current.setGender(rs.getInt("genderid"));
                current.setDOB(rs.getDate("DOB"));
                current.setEmail(rs.getString("email"));
                current.setPass(rs.getString("pass"));
                getUserdata.add(current);
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
        return getUserdata;
    }

    public void addnewUSer(User s) {
        try {
            String sql = "INSERT INTO [User] values(?,?,?,?,?,?,?)";
            Connection con = SQLconnector.connectDatabase();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, s.getId());
            statement.setString(2, s.getFname());
            statement.setString(3, s.getLnamne());
            statement.setInt(4, s.getGender());
            statement.setDate(5, s.getDOB());
            statement.setString(6, s.getEmail());
            statement.setString(7, s.getPass());
            statement.executeUpdate();
        } catch (SQLException|ClassNotFoundException ex) {

        }
    }

    public static void main(String[] args) {
        ArrayList<User> nua = getAll();

        for (User a : nua) {
            System.out.println(a.getId());
        }
    }

}
