/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author duynh
 */
public class loginA extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Connection con = sqlconnector.connectSQL();

            ArrayList<account> newLogin = new ArrayList<>();
            Statement newStatement = con.createStatement();
            String state = "Select * from account";
            
            String find = "Select * from account where account = ";
            ResultSet rs = newStatement.executeQuery(state);
            String newA = request.getParameter("az");
            String newP = request.getParameter("pz");
            String remember = request.getParameter("remember");
            ResultSet search =  newStatement.executeQuery(find + "'" + newA + "'");
            while (search.next()) {
                account newLoginz = new account(search.getString("account"), search.getString("passwords"), search.getString("displayname"));
                newLogin.add(newLoginz);
            }
            
            String name = "user";
            HttpSession session = request.getSession();
           
            request.setAttribute("user", newLogin ); 
            
             RequestDispatcher rd = 
             request.getRequestDispatcher("detail.jsp");
             
            for(account newid : newLogin){
                if(newid.getA().equals(newA) && newid.getA().equals(newP)){
                     if(remember !=null){
                    Cookie firstvalue = new Cookie("Username",newA);
                    Cookie secondvalue = new Cookie("Password",newP);
                    firstvalue.setMaxAge(1000);
                    secondvalue.setMaxAge(1000);
                    response.addCookie(firstvalue);
                    response.addCookie(secondvalue);
                    rd.forward(request, response);
                }
                     else{  
                      rd.forward(request, response);
                }
                }
               
                else{
                    response.sendRedirect("login.jsp");
                }
            }
            
           

        } catch (Exception e) {
                    out.println(e);
        }
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
