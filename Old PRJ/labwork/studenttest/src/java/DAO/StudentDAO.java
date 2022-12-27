/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
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
public class StudentDAO extends BaseDAO<Student> {

    @Override
    public ArrayList<Student> getAll() {
         ArrayList<Student> students = new ArrayList<>();
       try {
           String sql = "SELECT [id]\n" +
                   "      ,[name]\n" +
                   "      ,[gender]\n" +
                   "      ,[dob]\n" +
                   "  FROM [Student]";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Student s = new Student();
               s.setId(rs.getInt("id"));
               s.setName(rs.getString("name"));
               s.setGender(rs.getBoolean("gender"));
               s.setDob(rs.getDate("dob"));
               students.add(s);
           }
       } catch (SQLException ex) {
           Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return students;
    }
    
     public Student getStudent(int id) {
       try {
           String sql = "SELECT s.id,s.name,s.gender,s.dob FROM Student s\n"
                   + "WHERE s.id = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Student s = new Student();
               s.setId(rs.getInt("id"));
               s.setName(rs.getString("name"));
               s.setDob(rs.getDate("dob"));
               s.setGender(rs.getBoolean("gender"));
               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
   
   public void insertStudent(Student s) {
       try {
           String sql = "INSERT INTO [Student]\n"
                   + "           ([id]\n"
                   + "           ,[name]\n"
                   + "           ,[dob]\n"
                   + "           ,[gender]\n"
                   + "     VALUES\n"
                   + "           (?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, s.getId());
           statement.setString(2, s.getName());
           statement.setDate(3, s.getDob());
           statement.setBoolean(4, s.isGender());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   public void updateStudent(Student s) {
       try {
           String sql = "UPDATE [Student]\n"
                   + "   SET [name] = ?\n"
                   + "      ,[dob] = ?\n"
                   + "      ,[gender] = ?\n"
                   + " WHERE [id] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, s.getName());
           statement.setDate(2, s.getDob());
           statement.setBoolean(3, s.isGender());
           statement.setInt(4, s.getId());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   public void deleteStudent(int id) {
       try {
           String sql = "DELETE Student WHERE id=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}

