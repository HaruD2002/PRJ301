/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.ListDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import modal.Account;
import modal.Article;

/**
 *
 * @author duynh
 */
public class insertController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("user") != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String title = req.getParameter("title");
        Date date = new Date();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        System.out.println(sqldate);
        ListDBcontext db = new ListDBcontext();
        Account Login_user = (Account) req.getSession().getAttribute("user");
        if (id != null && id.length() > 0 && title != null && title.length() > 0) {
            Article new_article = new Article();
            new_article.setId(Integer.parseInt(id));
            new_article.setTitle(title);
            new_article.setCreated_by(Login_user.getUsername());
            new_article.setCreated_date(sqldate);
            Article c = db.insert_article(new_article);
            if (c == null) {
                resp.getWriter().println("Something when wrong");
            } else {
                resp.sendRedirect("list");
            }
        } else {
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (isAuthenticated(req)) {
            req.getRequestDispatcher("view/insert.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
