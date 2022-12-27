/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author duynh
 */
public class AccountDal extends BaseDal {

    public Account Authenticationwithuserid(String userid, String password) {
        try {
            String sql = "SELECT [userid]\n"
                    + "      ,[password]\n"
                    + "  FROM [Account]\n"
                    + "  where [userid] =  ? and [password] = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setString(1, userid);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account current = new Account();
                current.setUserid(rs.getString("userid"));
                current.setUserid(rs.getString("password"));
                return current;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
