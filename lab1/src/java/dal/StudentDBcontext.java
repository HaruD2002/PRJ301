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
import model.Department;
import model.Student;

/**
 *
 * @author duynh
 */
public class StudentDBcontext extends dbcontext {

    public ArrayList<Student> search(String department) {
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            String sql = "select s.[sid] as id,s.[snam] as [name], s.deptid as [Department id],d.dbane as [Department name] \n"
                    + "from Student s left join Department d on s.deptid = d.did";
            if (department.length() != 0) {
                sql += " where d.dbane = ? ";
            }
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            if (department.length() != 0) {
                stm.setString(1, department);
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student myStudent = new Student();
                myStudent.setSid(rs.getInt("id"));
                myStudent.setSname(rs.getString("name"));
                Department mydepartment = new Department();
                mydepartment.setDid(rs.getInt("Department id"));
                mydepartment.setDname(rs.getString("Department name"));
                myStudent.setDid(mydepartment);
                studentList.add(myStudent);

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return studentList;
    }
}
