/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.exerciseController;

import dal.TagDBcontext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Tag;

/**
 *
 * @author duynh
 */
public class insertExerciseController extends HttpServlet {

    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("login_user") != null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String content = req.getParameter("content");
        String tag = req.getParameter("tag");
        System.out.println(tag);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (isAuthenticated(req)) {
            TagDBcontext tdb = new TagDBcontext();
            ArrayList<Tag> tag_list = tdb.tag_list();
            req.setAttribute("tag_list", tag_list);
            req.getRequestDispatcher("../view/exercise/insert.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
