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
import model.Comment;
import model.Thread;
import model.User;

/**
 *
 * @author sonnt
 */
public class ThreadDBContext extends DBContext {

    public ArrayList<Thread> getThreads() {
        ArrayList<Thread> threads = new ArrayList<>();
        try {
            String sql = "SELECT t.tid,t.tcontent,a.displayname,a.userid,c.cid,c.ctitle FROM\n"
                    + "	Thread t LEFT JOIN Comment c ON t.tid = c.tid\n"
                    + "			 LEFT JOIN Account a ON c.userid = a.userid";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            Thread current = new Thread();
            current.setId(0);
            while(rs.next())
            {
                int tid = rs.getInt("tid");
                if(tid != current.getId())
                {
                    current = new Thread();
                    current.setId(tid);
                    current.setContent(rs.getString("tcontent"));
                    threads.add(current);
                }
                int cid = rs.getInt("cid");
                if(cid!=0)
                {
                    User user = new User();
                    user.setUserid(rs.getString("userid"));
                    user.setDisplayname(rs.getString("displayname"));
                    
                    Comment c = new Comment();
                    c.setId(cid);
                    c.setTitle(rs.getString("ctitle"));
                    c.setThread(current);
                    c.setUser(user);
                    current.getComments().add(c);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThreadDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return threads;
        
    }
}
