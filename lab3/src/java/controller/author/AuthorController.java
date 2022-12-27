/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.author;

import dal.AuthorDBcontext;
import dal.TypeDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Author;
import model.Type;

/**
 *
 * @author duynh
 */
public class AuthorController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("login_user") != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (isAuthenticated(req)) {
            String name = req.getParameter("aname");
            String raw_dob = req.getParameter("dob");
            String raw_gender = req.getParameter("gender");
            String tid = req.getParameter("type");
            if (name != null && raw_dob != null && raw_gender != null && tid != null
                    && name.length() >= 0 && raw_dob.length() >= 0 && raw_gender.length() >= 0 && tid.length() >= 0) {
                try {
                    java.util.Date format_dob = new SimpleDateFormat("yyyy-MM-dd").parse(raw_dob);
                    java.sql.Date dob = new java.sql.Date(format_dob.getTime());
                    boolean gender;
                    if (Integer.parseInt(raw_gender) == 1) {
                        gender = false;
                    } else {
                        gender = true;
                    }
                    Author new_author = new Author();
                    new_author.setName(name);
                    new_author.setDob(dob);
                    new_author.setGender(gender);
                    Type author_type = new Type();
                    author_type.setTid(Integer.parseInt(tid));
                    new_author.setTid(author_type);
                    new_author.setOrder_by((Account) req.getSession().getAttribute("login_user"));

                    AuthorDBcontext adb = new AuthorDBcontext();
                    adb.insert(new_author);
                    resp.getWriter().println("add successfully");

                } catch (ParseException ex) {
                    Logger.getLogger(AuthorController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                resp.getWriter().println("Not enough info");
            }

        } else {
            resp.getWriter().println("access denied!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (isAuthenticated(req)) {
            TypeDBcontext tdb = new TypeDBcontext();
            ArrayList<Type> all_type = tdb.getType();
            req.setAttribute("type", all_type);
            req.getRequestDispatcher("../view/insert.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
