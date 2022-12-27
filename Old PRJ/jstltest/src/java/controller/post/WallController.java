/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.post;

import controller.LogAuthentication.BaseAuthenticationController;
import dal.PostDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Account;
import model.Post;

/**
 *
 * @author duynh
 */
public class WallController extends BaseAuthenticationController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PostDBcontext db = new PostDBcontext();
        ArrayList<Post> posts = db.List();
        request.setAttribute("posts", posts);
        request.getRequestDispatcher("view/post/wall.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pid = Integer.parseInt(request.getParameter("pid"));;
        
        String content = request.getParameter("content");
        Account acc = (Account) request.getSession().getAttribute("account");
        
    }
   
   
}
