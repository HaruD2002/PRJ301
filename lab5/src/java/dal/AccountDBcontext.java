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
import modal.Account;

/**
 *
 * @author duynh
 */
public class AccountDBcontext extends DBcontext {

    public Account Login(String username, String password) {
        String sql = "select * from Account where username = ? and password = ?";

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                Account login_acc = new Account();
                login_acc.setUsername(rs.getString("username"));
                login_acc.setDisplay_name(rs.getString("displayName"));
                return login_acc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        AccountDBcontext db = new AccountDBcontext();
        Account user = db.Login("mra", "mra");
        System.out.println(user.getUsername());
    }
}
