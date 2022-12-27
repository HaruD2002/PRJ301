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

/**
 *
 * @author duynh
 */
public class AccountDal extends BaseDal {

    public Account getLogins(String username, String password) {
        try {
            String sql = "SELECT [username]\n"
                    + "      ,[Password]\n"
                    + "  FROM [Account] Where [username] = ? and [Password] = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                Account loginAcc = new Account();
                loginAcc.setUsername(username);
                loginAcc.setPassword(password);
                return loginAcc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
