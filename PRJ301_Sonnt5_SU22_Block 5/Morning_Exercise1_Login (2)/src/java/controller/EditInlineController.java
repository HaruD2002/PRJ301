/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.DetailDBContext;
import dal.MasterDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Detail;
import model.Master;

/**
 *
 * @author Hello Ngo Tung Son handsome
 */
public class EditInlineController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        ArrayList<Detail> details = detailDB.getDetails();
        ArrayList<Master> masters = masterDB.getMasters();
        request.setAttribute("details", details);
        request.setAttribute("masters", masters);
        request.getRequestDispatcher("view/edit.jsp").forward(request, response);
    } 
    
    MasterDBContext masterDB = new MasterDBContext();
    DetailDBContext detailDB = new DetailDBContext();

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Master m = new Master();
        m.setId(Integer.parseInt(request.getParameter("mid")));
        Detail d =new Detail();
        d.setId(Integer.parseInt(request.getParameter("did")));
        d.setName(request.getParameter("dname"));
        d.setAvai(request.getParameter("avai").equals("avai"));
        d.setMaster(m);
        detailDB.update(d);
        response.sendRedirect("edit");
    }

    


}
