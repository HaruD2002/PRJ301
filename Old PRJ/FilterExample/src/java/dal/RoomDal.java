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
import model.Room;

/**
 *
 * @author duynh
 */
public class RoomDal extends BaseDal {

    public ArrayList<Room> getAllroom() {
        ArrayList<Room> allroom = new ArrayList<>();
        try {
            String sql = "SELECT [rid]\n"
                    + "      ,[rname]\n"
                    + "  FROM [Room]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Room r = new Room();
                r.setRid(rs.getInt("rid"));
                r.setRname(rs.getString("rname"));
                allroom.add(r);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RoomDal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allroom;
    }
}
