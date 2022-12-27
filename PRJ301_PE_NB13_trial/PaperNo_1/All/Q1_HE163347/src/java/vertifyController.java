
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duynh
 */
public class vertifyController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("sname");
        String doe = req.getParameter("doe");
        String fsourse = req.getParameter("fsource");
        String lvl = req.getParameter("lvl");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("Student name:" + uname);
        pw.println("<br>");
        pw.println("Financial Source: "+ fsourse);
        pw.println("<br>");
        pw.println("Level: " + lvl);
        pw.println("<br>");
        pw.println("DOE: " + doe);
        pw.println("<br>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }
    
    
}
