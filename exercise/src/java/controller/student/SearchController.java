/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.student;

import dal.StudentDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author sonnt
 */
public class SearchController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String raw_from = req.getParameter("from");
        String raw_to = req.getParameter("to");
        if(name != null || raw_from != null || raw_to !=null) //not first time request
        {
            StudentDBContext db = new StudentDBContext();
            Date from = (raw_from ==null || raw_from.length()==0)?null:Date.valueOf(raw_from);
            Date to = (raw_to ==null || raw_to.length()==0)?null:Date.valueOf(raw_to);
            ArrayList<Student> students = db.searchStudents(name, from, to);
            req.setAttribute("students", students);
        }
        req.getRequestDispatcher("../view/student/search.jsp").forward(req, resp);
    }
    
}
