/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.validate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

/**
 *
 * @author duynh
 */
public class validateform extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean pass = true;
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("user");
        String email = req.getParameter("email");
        String confirm = req.getParameter("confim");
        String regrex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (username != null || email != null || confirm != null) {
            if (username.length() > 32 || username.length() < 6) {
                pass = false;
                out.println("<span id=\"emailError\"  style=\"color:red\"> username must constain 6 to 32 characters</span>");
                req.getRequestDispatcher("../index.html").forward(req, resp);
            }
            if (!Pattern.compile(regrex).matcher(email).matches()) {
                pass = false;
                
                out.println("\"<span id=\\\"emailError\\\"  style=\\\"color:red\\\">email enter not correct</span>\"");
                req.getRequestDispatcher("../index.html").forward(req, resp);
            }
            if (!email.equals(confirm)) {
                pass = false;
                out.println("\"<span id=\\\"emailError\\\"  style=\\\"color:red\\\">email did not match</span>\"");
                req.getRequestDispatcher("../index.html").forward(req, resp);
            }

            if (pass) {
                out.println("<html>");
                out.println("<head><title>A Test Servlet</title></head>");
                out.println("<body>");
                out.println("<p>" + username + "</p>");
                out.println("<p>" + email + "</p>");
                out.println("</body></html>");
            }
        } else {
            req.getRequestDispatcher("../index.html").forward(req, resp);
        }
    }

}
