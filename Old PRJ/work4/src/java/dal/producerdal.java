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
import model.producer;

/**
 *
 * @author duynh
 */
public class producerdal extends BaseDal {

    public ArrayList<producer> getAllproducer() {
        ArrayList<producer> lists = new ArrayList<>();
        try {
            String sql = "SELECT [proid]\n"
                    + "      ,[proname]\n"
                    + "  FROM [producer]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                producer pro = new producer();
                pro.setProid(rs.getInt("proid"));
                pro.setProname(rs.getString("proname"));
                lists.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categorydal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }
}
