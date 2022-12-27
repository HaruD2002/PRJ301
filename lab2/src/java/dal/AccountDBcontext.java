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
public class AccountDBcontext extends DBcontext {

    public Account login(Account user) {
        String sql = "Select * from Account where username = ? and [password] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPassword());

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Account login_user = new Account();
                login_user.setUsername(rs.getString("username"));
                return login_user;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        AccountDBcontext db = new AccountDBcontext();
        Account test = new Account();
        test.setUsername("admin");
        test.setPassword("1");
        Account login = db.login(test);
        System.out.println(login);
    }
}
