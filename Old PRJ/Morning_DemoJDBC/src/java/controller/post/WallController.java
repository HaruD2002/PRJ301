/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.post;

import controller.authentication.BaseAuthenticationController;
import dal.CommentDBContext;
import dal.PostDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Account;
import model.Comment;
import model.Post;

/**
 *
 * @author Ngo Tung Son
 */
public class WallController extends BaseAuthenticationController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PostDBContext db = new PostDBContext();
        ArrayList<Post> posts = db.list();
        request.setAttribute("posts", posts);
        request.getRequestDispatcher("view/post/wall.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pid = Integer.parseInt(request.getParameter("pid"));
        String content = request.getParameter("content");
        Account account = (Account)request.getSession().getAttribute("account");
        
        Post p = new Post();
        p.setId(pid);
        
        Comment c = new Comment();
        c.setContent(content);
        c.setPost(p);
        c.setAccount(account);
        
        CommentDBContext db = new CommentDBContext();
        db.insert(c);
        
        response.sendRedirect("wall");
        
    }
   
    

}
