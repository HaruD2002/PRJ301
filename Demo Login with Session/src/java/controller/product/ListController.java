/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.product;

import dal.ProductDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Order;
import model.OrderLine;
import model.Product;

/**
 *
 * @author sonnt
 */
public class ListController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("pid"));
        ProductDBContext db = new ProductDBContext();
        Product product = db.get(pid);
        if(product !=null)
        {
            Order order = (Order)req.getSession().getAttribute("cart");
            if(order ==null)
            {
                order = new Order();
            }
            //check selected product does exist in the cart yet?
            OrderLine existLine = null;
            for (OrderLine line : order.getLines()) {
                if(line.getProduct().getId() == product.getId())
                {
                    existLine = line;
                    break;
                }
            }
            if(existLine !=null)
            {
                existLine.setQuantity(existLine.getQuantity() + 1);
            }
            else
            {
                existLine = new OrderLine();
                existLine.setProduct(product);
                existLine.setQuantity(1);
                existLine.setUnitprice(product.getPrice());
                order.getLines().add(existLine);
            }
            req.getSession().setAttribute("cart",order);
            resp.sendRedirect("list");
        }
        else
            resp.getWriter().println("product does not exist!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDBContext db = new ProductDBContext();
        ArrayList<Product> products = db.getProducts();
        req.setAttribute("products", products);
        req.getRequestDispatcher("../view/product/list.jsp").forward(req, resp);
    }
    
}
