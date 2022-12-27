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
import model.Master;
import model.Question;

/**
 *
 * @author Ngo Tung Son
 */
public class MasterDBContext extends DBContext {
    public ArrayList<Master> getMasters()
    {
        ArrayList<Master> masters = new ArrayList<>();
                
        try {
            String sql = "SELECT mid, mname FROM [Master]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Master m = new Master();
                m.setId(rs.getInt("mid"));
                m.setName(rs.getString("mname"));
                masters.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return masters;
    }
}
