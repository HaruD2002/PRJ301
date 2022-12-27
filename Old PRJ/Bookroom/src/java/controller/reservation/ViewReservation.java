/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller.reservation;

import controller.login.BaseAuthentcation;
import dal.ReservationDal;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Reserveroom;

/**
 *
 * @author duynh
 */
public class ViewReservation extends BaseAuthentcation {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      ReservationDal db = new ReservationDal();
      ArrayList<Reserveroom> AllReserve = db.printReservation();
      request.setAttribute("AllReserve", AllReserve);
      request.getRequestDispatcher("../view/reservation/ViewReservation.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
   
}
