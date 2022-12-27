/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.product;

import dal.BaseDal;
import dal.categorydal;
import dal.producerdal;
import dal.productdal;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import model.Category;
import model.producer;
import model.product;

/**
 *
 * @author duynh
 */
public class createnewproduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        categorydal catedb = new categorydal();
        ArrayList<Category> catelist = catedb.getAllcategory();

        producerdal prodb = new producerdal();

        ArrayList<producer> prolist = prodb.getAllproducer();
        request.setAttribute("prolist", prolist);
        request.setAttribute("catelist", catelist);
        request.getRequestDispatcher("../view/insertnewP.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int pids = Integer.parseInt(request.getParameter("pid"));
        String pnames = request.getParameter("pname");
        int pprices = Integer.parseInt(request.getParameter("pprice"));
        boolean pisActives = request.getParameter("pisActive") != null; 
        
        
        
        Date pimportdate = Date.valueOf(request.getParameter("pactivedate"));
        int pcategorys = Integer.parseInt(request.getParameter("pcata"));
        Category cate = new Category();
        cate.setCateid(pcategorys);
        int pproducers  = Integer.parseInt(request.getParameter("pprod"));        
        producer pro = new producer();
        pro.setProid(pproducers);
        product newproduct = new product();
        newproduct.setId(pids);
        newproduct.setName(pnames);
        newproduct.setImportDate(pimportdate);
        newproduct.setIsActive(pisActives);
        newproduct.setProid(pro);
        newproduct.setCateid(cate);
        newproduct.setPrice(pprices);
        productdal prodb = new productdal();
        prodb.insertnewproduct(newproduct);
        response.getWriter().println("inserted");
        
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
