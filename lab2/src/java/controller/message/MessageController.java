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
import java.util.ArrayList;
import model.Account;
import model.Message;

/**
 *
 * @author duynh
 */
public class MessageController extends HttpServlet {
    private boolean isAuthenticated(HttpServletRequest req) {
        return req.getSession().getAttribute("user") != null;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (isAuthenticated(req)) {
            Account user = (Account) req.getSession().getAttribute("user");
            MessageDBcontext db = new MessageDBcontext();
            ArrayList<Message> all_message = db.getUserMessage(user.getUsername());
            req.setAttribute("message", all_message);
            req.getRequestDispatcher("/view/list.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (isAuthenticated(req)) {
                
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
