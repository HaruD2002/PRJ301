/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
public class getCookie extends HttpServlet {

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
        String username = request.getParameter("username");
       String password = request.getParameter("password");
       
       Cookie cookie = new Cookie("name", "billy");
       cookie.setMaxAge(3600*24*7*365);
       response.addCookie(cookie);
       
       
        AccountDAO db = new AccountDAO(); // database
        Account account =  db.getAccountByUsernameAndPassword(username, password);
       if(account != null) // login successfully!
       {
           String remember = request.getParameter("remember");
           if(remember !=null)
           {
               Cookie c_user = new Cookie("username", username);
               Cookie c_pass = new Cookie("password", password);
               c_user.setMaxAge(3600*24*30);
               c_pass.setMaxAge(3600*24*30);
               response.addCookie(c_pass);
               response.addCookie(c_user);
           }
           HttpSession session = request.getSession();
           session.setAttribute("user", account);
           response.getWriter().println("login successful!");
       }
       else //login fail
       {
           response.getWriter().println("username/password is invalid");
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
