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
import model.Type;

/**
 *
 * @author duynh
 */
public class TypeDBcontext extends dbcontext {

    public ArrayList<Type> getType() {
        String sql = "select * from [Type]";
        ArrayList<Type> list_type = new ArrayList<>();

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Type new_type = new Type();
                new_type.setTid(rs.getInt("tid"));
                new_type.setTname(rs.getString("tname"));
                list_type.add(new_type);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_type;
    }
}
