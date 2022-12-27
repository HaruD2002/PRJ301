package dal;


import dal.DBcontext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Exercise;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author duynh
 */
public class ExerciseDBcontext extends DBcontext {

    public ArrayList<Exercise> exercise_list() {
        String sql = "select * from exercise";
        ArrayList<Exercise> list = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int i = 1;
                Exercise new_equip = new Exercise();
                new_equip.setEid(rs.getInt("eid"));
                new_equip.setContent(rs.getString("content"));
                Account user = new Account();
                new_equip.setCreated_by(rs.getString("created_by"));
                new_equip.setCreateed_date(rs.getDate("created_date"));
                list.add(new_equip);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExerciseDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        ExerciseDBcontext db = new ExerciseDBcontext();
        ArrayList<Exercise> list = db.exercise_list();
        for (Exercise e : list) {
            System.out.println(e.getCreated_by());
        }
    }
}
