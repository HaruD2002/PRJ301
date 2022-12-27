/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Account;
import modal.Article;

/**
 *
 * @author duynh
 */
public class ListDBcontext extends DBcontext {

    public ArrayList<Article> artile_list(Account user) {
        String sql = "select * from Article";
        ArrayList<Article> list = new ArrayList<>();

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            int i = 1;
            while (rs.next()) {

                Article new_article = new Article();
                new_article.setId(rs.getInt("id"));
                new_article.setTitle(rs.getString("title"));
                new_article.setCreated_date(rs.getDate("created_date"));
                Map user_map = new HashMap();
                user_map.put(i, rs.getString("created_by"));
                i++;
                new_article.setCreated_by(rs.getString("created_by"));
                list.add(new_article);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Article insert_article(Article new_article) {
        String sql = "insert into Article values (?,?,?,?)";

        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, new_article.getId());
            stm.setString(2, new_article.getTitle());
            stm.setDate(3, new_article.getCreated_date());
            stm.setString(4, new_article.getCreated_by());
            Article new_articles = new Article();
            stm.executeUpdate();
            return new_article;
           
        } catch (SQLException ex) {
            Logger.getLogger(ListDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
