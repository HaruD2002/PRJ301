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
import model.Student;

/**
 *
 * @author duynh
 */
public class StudentDBcontext extends DBContext {

    public ArrayList<Student> search(String part) {
        String sql = "select * from Student";
        ArrayList<Student> student_list = new ArrayList<>();
        try {
            if (part.length() != 0) {
                sql += " where [name] like ?" ;
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (part.length() != 0) {
                stm.setString(1, "%"+part+"%");
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student new_student = new Student();
                new_student.setSid(rs.getInt("sid"));
                new_student.setName(rs.getString("name"));
                new_student.setGender(rs.getBoolean("gender"));
                new_student.setDob(rs.getDate("dob"));
                student_list.add(new_student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student_list;
    }

    public static void main(String[] args) {
        StudentDBcontext db = new StudentDBcontext();
        ArrayList<Student> tryx = db.search("io");
        for (Student a : tryx) {
            System.out.println(a.getName());
        }
    }
}
