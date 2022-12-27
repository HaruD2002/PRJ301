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
import model.Account;
import model.Customer;
import model.Reserveroom;
import model.Room;

/**
 *
 * @author duynh
 */
public class ReservationDal extends BaseDal {

    public ArrayList<Reserveroom> printReservation() {
        ArrayList<Reserveroom> reserve = new ArrayList<>();
        try {
            String sql = "SELECT [cusid]\n"
                    + "      ,[from]\n"
                    + "      ,[to]\n"
                    + "      ,[userid]\n"
                    + "      ,[rid]\n"
                    + "  FROM [Reservation]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Reserveroom r = new Reserveroom();
                //
                Customer c = new Customer();
                c.setCusid(rs.getInt("cusid"));
                r.setCusid(c);
                //
                r.setFrom(rs.getDate("from"));
                r.setTo(rs.getDate("to"));
                //
                Account acc = new Account();
                acc.setUserid(rs.getString("userid"));
                r.setUserid(acc);
                //
                Room room = new Room();
                room.setRid(rs.getInt("rid"));
                r.setRid(room);                
                reserve.add(r);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reserve;
    }

    public void createReservation(Reserveroom r) {
        try {
            String sql = "INSERT INTO [Reservation]\n"
                    + "           ([cusid]\n"
                    + "           ,[from]\n"
                    + "           ,[to]\n"
                    + "           ,[userid]\n"
                    + "           ,[rid])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, r.getCusid().getCusid());
            stm.setDate(2, r.getFrom());
            stm.setDate(3, r.getTo());
            stm.setString(4, r.getUserid().getUserid());
            stm.setInt(5, r.getRid().getRid());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
