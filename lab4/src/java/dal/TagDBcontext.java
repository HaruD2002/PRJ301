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
import model.Tag;

/**
 *
 * @author duynh
 */
public class TagDBcontext extends DBcontext{
    
    public ArrayList<Tag> tag_list(){
        String sql = "Select * from tag";
        ArrayList<Tag> taglist = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Tag new_tag = new Tag();
                new_tag.setTid(rs.getInt("tid"));
                new_tag.setTname(rs.getString("tname"));
                taglist.add(new_tag);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TagDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return taglist;
    }
    
}
