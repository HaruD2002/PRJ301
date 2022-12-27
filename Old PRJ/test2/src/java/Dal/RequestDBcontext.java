/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import Model.Request;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duynh
 */
public class RequestDBcontext extends BaseDal<Request> {

    @Override
    public ArrayList<Request> list() {
        ArrayList<Request> Requests = new ArrayList<>();
        try {
            String sql = "select r.rid, r.content,r.createDate,r.categoryid,r.toUser,r.username from Request r left join Account a on r.username = a.username\n"
                    + "left join Category c on c.cid = r.categoryid";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
