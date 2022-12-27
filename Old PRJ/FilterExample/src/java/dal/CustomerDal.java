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
import model.Customer;

/**
 *
 * @author duynh
 */
public class CustomerDal extends BaseDal {

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> listcustomer = new ArrayList<>();
        try {
            String sql = "SELECT [cusid]\n"
                    + "      ,[cusname]\n"
                    + "  FROM [Customer]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCusid(rs.getInt("cusid"));
                c.setCusname(rs.getString("cusname"));
                listcustomer.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RoomDal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listcustomer;
    }

}
