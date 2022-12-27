/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Message;

/**
 *
 * @author duynh
 */
public class MessageDBcontext extends DBcontext {

    public ArrayList<Message> getUserMessage(String username) {
        String sql = "Select * from Message where [create by] = ?";
        ArrayList<Message> userMesage = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Message user_mess = new Message();
                user_mess.setId(rs.getInt("mid"));
                user_mess.setTitle(rs.getString("title"));
                user_mess.setCreatedDate(rs.getDate("date"));
                userMesage.add(user_mess);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userMesage;
    }

    public void createNewMessage(String title, Date date, String user) {
        String sql = "insert into [Message](title,[date],[create by]) values (?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, title);
            stm.setDate(2, date);
            stm.setString(3, user);
            stm.executeUpdate();
            System.out.println("Success");
        } catch (SQLException ex) {
            Logger.getLogger(MessageDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        MessageDBcontext db = new MessageDBcontext();
        Account user = new Account();
        user.setUsername("admin");
        user.setPassword("1");
        String date = "2022/12/07";
        try {
            java.util.Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);
            java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
            db.createNewMessage("this should add", sqlDate, user.getUsername());
        } catch (ParseException ex) {
            Logger.getLogger(MessageDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
