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
import model.Feature;
import model.Role;

/**
 *
 * @author Ngo Tung Son
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "SELECT [username]\n"
                    + "      ,[password]\n"
                    + "      ,[qid]\n"
                    + "      ,[answer]\n"
                    + "  FROM [Account]\n"
                    + "  WHERE [username] = ?\n"
                    + "  AND [password] = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getPassword(String username, int qid, String answer) {
        try {
            String sql = "SELECT [password]\n"
                    + "  FROM [Account]\n"
                    + "  WHERE [username] = ?\n"
                    + "  AND qid = ?\n"
                    + "  AND answer = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setInt(2, qid);
            stm.setString(3, answer);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Role> getRoles(String username) {
        ArrayList<Role> roles = new ArrayList<>();
        try {
            String sql = "SELECT  \n"
                    + "	r.id as rid,r.name,ISNULL(f.id,-1) as fid,f.url\n"
                    + "FROM Role_Account ra LEFT JOIN Roles r\n"
                    + "				ON ra.rid = r.id\n"
                    + "				LEFT JOIN Role_Feature fr\n"
                    + "				ON r.id = fr.rid\n"
                    + "				LEFT JOIN Feature f\n"
                    + "				ON f.id = fr.fid\n"
                    + "WHERE ra.username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            Role currentRole = new Role();
            currentRole.setId(-1);
            while(rs.next())
            {
                int rid = rs.getInt("rid");
                if(rid != currentRole.getId())
                {
                    currentRole = new Role();
                    currentRole.setId(rid);
                    currentRole.setName(rs.getString("name"));
                    currentRole.setFeatures(new ArrayList<>());
                    roles.add(currentRole);
                }
                int fid = rs.getInt("fid");
                if(fid!=-1)
                {
                    Feature f = new Feature();
                    f.setId(rs.getInt("fid"));
                    f.setUrl(rs.getString("url"));
                    currentRole.getFeatures().add(f);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return roles;
    }
}
