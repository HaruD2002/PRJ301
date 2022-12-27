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
import model.*;

/**
 *
 * @author duynh
 */
public class StudentDBcontext extends DBcontext<Student> {

    @Override
        public ArrayList<Student> List() {

        return null;
    }

    public ArrayList<Student> searchById(int did) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = "select s.sid, s.sname,s.dob,s.gender,s.did,d.dname from Student s inner join Department d on s.did = d.did" ;

            if (did > 0) {
                sql += "where s.did = ?";
            }

            PreparedStatement stm = connection.prepareStatement(sql);

            if (did > 0) 
                stm.setInt(1, did);
                ResultSet rs = stm.executeQuery();       
                while(rs.next()){
                    Department d = new Department();
                    d.setId(rs.getInt("did"));
                    d.setName(rs.getString("dname"));
                    
                    Student s = new Student();
                    s.setId(rs.getInt("sid"));
                    s.setName(rs.getString("sname"));
                    s.setGender(rs.getBoolean("gender"));
                    s.setDob(rs.getDate("dob"));
                    s.setDept(d);
                    
                 students.add(s);
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return students;
    }

    @Override
    public void insert(Student model) {

        try {
            String sql = "INSERT INTO [Student]\n"
                    + "           ([sname]\n"
                    + "           ,[gender]\n"
                    + "           ,[dob]\n"
                    + "           ,[did])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setBoolean(2, model.isGender());
            stm.setDate(3, model.getDob());
            stm.setInt(4, model.getDept().getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Student Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Student Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
