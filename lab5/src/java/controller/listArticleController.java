/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.AccountDBcontext;
import dal.ListDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modal.Account;
import modal.Article;

/**
 *
 * @author duynh
 */
public class listArticleController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("user") != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (isAuthenticated(req)) {
            Account user = (Account) req.getSession().getAttribute("user");
            ListDBcontext db = new ListDBcontext();
            ArrayList<Article> list = db.artile_list(user);
            req.setAttribute("list", list);
            req.getRequestDispatcher("view/Article_list.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }

    }

}
