/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.student;

import controller.LogAuthentication.BaseAuthenticationController;
import dal.DBcontext;
import dal.DepartmentDbContext;
import dal.StudentDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author duynh
 */
public class insertController extends BaseAuthenticationController {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
//          ((Account)request.getSession().getAttribute("account")).getDisplaynaem();
        DBcontext<Department> db = new DepartmentDbContext();
        ArrayList<Department> depts = db.List();
        request.setAttribute("depts", depts);

        request.getRequestDispatcher("../view/student/insert.jsp").forward(request, response);
        
        }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        Date dob = Date.valueOf(request.getParameter("dob"));
        int did = Integer.parseInt(request.getParameter("did"));
        Department d = new Department();
        d.setId(did);
        Student s = new Student();
        s.setName(name);
        s.setGender(gender);
        s.setDob(dob);
        s.setDept(d);
        DBcontext<Student> db = new StudentDBcontext();
        db.insert(s);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
