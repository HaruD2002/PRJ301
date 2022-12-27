/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.arthor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
public class authorDB extends BaseDal<arthor>{

    @Override
    public ArrayList<arthor> list() {
    ArrayList<arthor> listofArthor = new ArrayList<>();
        try {
            String sql = "select aid,aname from arthor";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                arthor a = new arthor();
                a.setAid(rs.getInt("aid"));
                a.setAname(rs.getString("aname"));
                listofArthor.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(authorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listofArthor;    
    }

    @Override
    public void insert(arthor model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
    