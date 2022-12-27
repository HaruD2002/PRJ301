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
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author sonnt
 */
public class StudentDBContext extends DBContext {

    public ArrayList<Student> searchStudents(String name, Date from, Date to) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            HashMap<Integer,Object> params = new HashMap<>();
            int count = 0;
            String sql = "SELECT id,name,gender,dob FROM Student\n"
                    + "WHERE 1=1";
            if(name != null && name.length() >0)
            {
                sql += " AND [name] like '%'+?+'%'";
                count++;
                params.put(count, name);
            }
            
            if(from !=null)
            {
                sql+= " AND dob >= ?";
                count++;
                params.put(count, from);
            }
            if(to !=null)
            {
                sql+= " AND dob <= ?";
                count++;
                params.put(count, to);
            }
            
            PreparedStatement stm = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : params.entrySet()) {
                Integer key = entry.getKey();
                Object val = entry.getValue();
                stm.setObject(key, val);
            }
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setDob(rs.getDate("dob"));
                s.setGender(rs.getBoolean("gender"));
                students.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }
}
