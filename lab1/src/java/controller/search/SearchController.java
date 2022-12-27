/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.search;

import dal.StudentDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author duynh
 */
public class SearchController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("department");
//        System.out.println(value);
        StudentDBcontext db = new StudentDBcontext();
        ArrayList<Student> search = db.search(value.toLowerCase());
        System.out.println(search.size());
        for(Student s : search){
            System.out.println(s);
        }
        req.setAttribute("Studentlist", search);
        req.getRequestDispatcher("view/search.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/search.jsp").forward(req, resp);
    }

}
