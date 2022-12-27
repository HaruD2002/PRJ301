/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Author;

/**
 *
 * @author duynh
 */
public class AuthorDBcontext extends dbcontext{
    
    public void insert(Author new_author){
         String sql = "insert into Author([name],dob,gender,tid,[order by]) values (?,?,?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, new_author.getName());
            stm.setDate(2, new_author.getDob());
            stm.setBoolean(3, new_author.isGender());
            stm.setInt(4, new_author.getTid().getTid());
            stm.setString(5, new_author.getOrder_by().getUsername());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
