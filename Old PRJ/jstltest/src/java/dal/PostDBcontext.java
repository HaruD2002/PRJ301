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
 * @author duynh
 */
public class PostDBcontext extends DBcontext<Post> {

    @Override
    public ArrayList<Post> List() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select p.pid,p.pcontent,ap.username as \n"
                    + "'pusername',ap.displayname \n"
                    + "as 'pdisplayname',\n"
                    + "c.cid,\n"
                    + "c.ccontent,\n"
                    + "ac.username as 'cusername',\n"
                    + "ac.displayname as 'cdisplayname'\n"
                    + "from Post p left join Comment c\n"
                    + "on \n"
                    + "p.pid = c.pid\n"
                    + "left join Account ap on ap.username = p.username\n"
                    + "left join Account ac on c.username = ac.username\n"
                    + "\n"
                    + "order by p.pid asc";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            Post current = new Post();
            current.setId(-1);
            while(rs.next()){
                int pid = rs.getInt("pid");
                if(pid != current.getId()){
                    current = new Post();
                    current.setId(pid);
                    current.setContent(rs.getString("pcontent"));
                    Account paccount = new Account();
                    paccount.setUsername(rs.getString("pusername"));
                    paccount.setDisplaynaem(rs.getString("pdisplayname"));
                    current.setAccout(paccount);
                    posts.add(current); 
                }
                int cid = rs.getInt("cid");
                if(cid !=0){
                    Comment c = new Comment();
                    c.setId(cid);
                    c.setContent(rs.getString("ccontent"));
                    Account caccount = new Account();
                    caccount.setUsername(rs.getString("cusername"));
                    caccount.setDisplaynaem(rs.getString("cdisplayname"));
                    c.setAccount(caccount);
                    c.setPost(current);
                    current.getComment().add(c);
                }
            }
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(PostDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return posts;
    }

    @Override
    public void insert(Post Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Post Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Post Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
