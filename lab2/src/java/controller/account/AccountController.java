/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.account;

import dal.AccountDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.Account;

/**
 *
 * @author duynh
 */
public class AccountController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account user = new Account();
        user.setUsername(username);
        user.setPassword(password);
        AccountDBcontext db = new AccountDBcontext();
        Account login_user = db.login(user);
        System.out.println(login_user);
        if (login_user != null) {
            resp.getWriter().println("Login success. Hello " + login_user.getUsername());
            req.getSession().setAttribute("user", login_user);
        }else{
            resp.getWriter().println("Login fail");        
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/login.jsp").forward(req, resp);
    }

}
