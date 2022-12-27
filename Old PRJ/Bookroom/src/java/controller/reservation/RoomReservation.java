/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.reservation;

import controller.login.BaseAuthentcation;
import dal.CustomerDal;
import dal.ReservationDal;
import dal.RoomDal;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import model.Account;
import model.Customer;
import model.Reserveroom;
import model.Room;

/**
 *
 * @author duynh
 */
public class RoomReservation extends BaseAuthentcation {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            CustomerDal cusdb = new CustomerDal();
            ArrayList<Customer> displayCustomer = cusdb.getAllCustomer();
            RoomDal roomdb = new RoomDal();
            ArrayList<Room> displayRoom = roomdb.getAllroom();
            HttpSession session = request.getSession();
            
            session.setAttribute("displayCustomer", displayCustomer );
            session.setAttribute("displayRoom",displayRoom);
            request.getRequestDispatcher("../view/reservation/CreateReservation.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {                    
            int cusid = Integer.parseInt(request.getParameter("cuss"));         
            Customer c = new Customer();
            c.setCusid(cusid);
            int roomid = Integer.parseInt(request.getParameter("rooms"));
            Room r = new Room();
            r.setRid(roomid);
            Date fromDate = Date.valueOf(request.getParameter("fromDate"));
            Date toDate = Date.valueOf(request.getParameter("toDate"));
            HttpSession session = request.getSession();
            Account user = (Account)session.getAttribute("account");
            
            Reserveroom room = new Reserveroom();
            room.setCusid(c);           
            room.setFrom(fromDate);
            room.setTo(toDate);
            room.setUserid(user);
            room.setRid(r);
            
            
            ReservationDal db = new ReservationDal();
            
            db.createReservation(room);
            response.getWriter().println("Reserve Complete");
    }
   
}
