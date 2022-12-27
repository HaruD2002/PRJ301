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
import model.article;

/**
 *
 * @author duynh
 */
public class articledb extends BaseDal<article>{

    @Override
    public ArrayList<article> list() {
    ArrayList<article> listofArticle = new ArrayList<>();
        try {
            String sql = "select [arid],[arname] from article";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                article ar = new article();
                ar.setArid(rs.getInt("arid"));
                ar.setArname(rs.getString("arname"));
                listofArticle.add(ar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(authorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listofArticle;       
    }

    @Override
    public void insert(article model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
