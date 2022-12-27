/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sessionListener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 *
 * @author duynh
 */
public class countSession implements HttpSessionListener{
    ServletContext ctx=null; 
    static int total=0,current=0;  
      
    public void sessionCreated(HttpSessionEvent e) {  
    total++;  
    current++;  
      
    ctx=e.getSession().getServletContext();  
    ctx.setAttribute("totalusers", total);  
    ctx.setAttribute("currentusers", current);  
      
    }  
  
    public void sessionDestroyed(HttpSessionEvent e) {  
        current--;  
        ctx.setAttribute("currentusers",current);  
    }  
  
}  

