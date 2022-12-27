/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author sonnt
 */
public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String dob = req.getParameter("dob");
            String phone = req.getParameter("phone");
            String password = req.getParameter("password");
            String confirm = req.getParameter("confirm");
            Date newDOB = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
            //validate parameters
            Boolean isPass = true;
            
            
            //if passed
            Account account = new Account();
            account.setUsername(username);
            account.setPassword(password);
            account.setEmail(email);
            account.setPhone(phone);
            account.setDOB(newDOB);
            //option 1
            //resp.getWriter().println("Hello "+ account.getUsername());
            //option 2
            req.setAttribute("account", account);
            req.getRequestDispatcher("../view/user/welcome.jsp").forward(req, resp);
        } catch (ParseException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../view/user/register.jsp").forward(req, resp);
    }
    
}
