/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.message;

import dal.MessageDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author duynh
 */
public class CreateMessageController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("user") != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (isAuthenticated(req)) {
            try {
                String title = req.getParameter("title");
                String date = req.getParameter("date");
                if (title != null && date != null && title.length()>0 && date.length()>0) {
                    resp.getWriter().println(title);
                    resp.getWriter().println(date);
                    java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                    java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
                    Account user = (Account) req.getSession().getAttribute("user");
                    resp.getWriter().println(date1);
                    MessageDBcontext db = new MessageDBcontext();
                    db.createNewMessage(title, sqlDate, user.getUsername());
                    resp.sendRedirect("list");
                } else {
                    resp.getWriter().println("cant create nothin");
                    resp.getWriter().println("<a href='create-message'>return</a>");
                }
            } catch (ParseException ex) {
                Logger.getLogger(CreateMessageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            resp.getWriter().println("access denied!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (isAuthenticated(req)) {
            req.getRequestDispatcher("view/create.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
