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
import model.Detail;
import model.Master;

/**
 *
 * @author Ngo Tung Son
 */
public class DetailDBContext extends DBContext {

    public ArrayList<Detail> getDetails() {
        ArrayList<Detail> details = new ArrayList<>();

        try {
            String sql = "SELECT d.did,d.name,d.available,m.mid,m.mname FROM Detail d INNER JOIN [Master] m\n"
                    + "ON d.mid = m.mid";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Master m = new Master();
                m.setId(rs.getInt("mid"));
                m.setName(rs.getString("mname"));
                Detail d = new Detail();
                d.setMaster(m);
                d.setId(rs.getInt("did"));
                d.setName(rs.getString("name"));
                d.setAvai(rs.getBoolean("available"));
                details.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }

    public void update(Detail d) {
        try {
            String sql = "UPDATE [Detail]\n"
                    + "   SET [name] = ?\n"
                    + "      ,[mid] = ?\n"
                    + "      ,[available] = ?\n"
                    + " WHERE did = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, d.getName());
            stm.setInt(2, d.getMaster().getId());
            stm.setBoolean(3, d.isAvai());
            stm.setInt(4, d.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetailDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
