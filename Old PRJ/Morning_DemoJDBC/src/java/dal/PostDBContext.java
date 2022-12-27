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
import model.Comment;
import model.Post;

/**
 *
 * @author Ngo Tung Son
 */
public class PostDBContext extends DBContext<Post> {

    @Override
    public ArrayList<Post> list() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "SELECT p.pid,p.pcontent,\n" +
                    "ap.username as 'pusername',\n" +
                    "ap.displayname as 'pdisplayname',\n" +
                    "c.cid,\n" +
                    "c.ccontent,\n" +
                    "ac.username as 'cusername',\n" +
                    "ac.displayname as 'cdisplayname'\n" +
                    "FROM Post p LEFT JOIN Comment c ON p.pid = c.pid\n" +
                    "LEFT JOIN Account ap ON ap.username = p.username\n" +
                    "LEFT JOIN Account ac ON c.username = ac.username\n" +
                    "ORDER BY p.pid ASC";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            Post current = new Post();
            current.setId(-1);
            while(rs.next())
            {
                int pid = rs.getInt("pid");
                if(pid != current.getId())
                {
                    current = new Post();
                    current.setId(pid);
                    current.setContent(rs.getString("pcontent"));
                    Account paccount = new Account();
                    paccount.setUsername(rs.getString("pusername"));
                    paccount.setDisplayname(rs.getString("pdisplayname"));
                    current.setAccount(paccount);
                    posts.add(current);
                }
                int cid = rs.getInt("cid");
                if(cid!=0)
                {
                    Comment c = new Comment();
                    c.setId(cid);
                    c.setContent(rs.getString("ccontent"));
                    Account caccount = new Account();
                    caccount.setUsername(rs.getString("cusername"));
                    caccount.setDisplayname(rs.getString("cdisplayname"));
                    c.setAccount(caccount);
                    c.setPost(current);
                    current.getComments().add(c);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
        
    }

    @Override
    public void insert(Post model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Post model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Post model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
