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
import model.Category;

/**
 *
 * @author duynh
 */
public class categorydal extends BaseDal {

    public ArrayList<Category> getAllcategory() {
        ArrayList<Category> lists = new ArrayList<>();
        try {
            String sql = "SELECT [cateid]\n"
                    + "      ,[catename]\n"
                    + "  FROM [category]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category cates = new Category();
                cates.setCateid(rs.getInt("cateid"));
                cates.setCatrname(rs.getString("catename"));
                lists.add(cates);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categorydal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }
}
