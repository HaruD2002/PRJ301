/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.accountController;

import dal.AccountDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;

/**
 *
 * @author duynh
 */
public class loginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username == null && password == null) {
            req.getRequestDispatcher("view/login/login.jsp").forward(req, resp);
        } else {
            Account user = new Account();
            user.setUsername(username);
            user.setPassword(password);
            AccountDBcontext db = new AccountDBcontext();
            Account login_user = db.login(user);
            if (login_user == null) {
                resp.getWriter().println("Login fail");
            } else {
                req.getSession().setAttribute("login_user", login_user);
                resp.getWriter().println("Login Successful");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/login/login.jsp").forward(req, resp);
    }

}
