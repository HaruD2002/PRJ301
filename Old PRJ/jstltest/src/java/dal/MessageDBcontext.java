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
import model.message;

/**
 *
 * @author duynh
 */
public class MessageDBcontext extends DBcontext<message> {

    public ArrayList<message> getListinbox(String user) {
        ArrayList<message> display = new ArrayList<>();

        try {
            String sql = "select id as 'mid' , content as 'mcontent',\n"
                    + "createDate as 'mcreateDate',[from] as 'mfrom',\n"
                    + "[to] as 'mto'\n"
                    + "\n"
                    + "\n"
                    + "from [message] where [to] = ";
            PreparedStatement stm = connection.prepareStatement(sql + user);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                message m = new message();
                m.setMid(rs.getInt("id"));
                m.setMcontent(rs.getString("content"));
                m.setmCreateDate(rs.getDate("createDate"));
                Account facc = new Account();
                facc.setUsername("");
                m.setmFrom(facc);
                Account macc = new Account();
                macc.setUsername("[to]");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertMessbyUser(String User) {
        String sql = "insert into [message](content,createDate,[from],[to]) values (?,?,?,?)";

    }

    @Override
    public ArrayList<message> List() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(message Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(message Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(message Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
