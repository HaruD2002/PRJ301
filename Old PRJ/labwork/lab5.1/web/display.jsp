<%-- 
    Document   : display
    Created on : 20/03/2022, 9:07:02 PM
    Author     : duynh
--%>

<%@page import="model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>3 value String </h1>
         <%    
        try{
           String []displayA = (String[]) session.getAttribute("firstString");
           for (int i = 0; i < displayA.length ; i++) {
                   out.println("<h2>" + displayA[i] + "</h2> ");
               }
        }catch(Exception e){
                    out.println(e);
        } 
        %>
        
        <h1> String Name</h1>
        <%
    try{
            Name []displayB = (Name[])session.getAttribute("secondString");
            
            for (int i = 0; i < displayB.length; i++) {
                out.println("<h2>" + displayB[i].getFirstname() + " "+displayB[i].getLastname() + "</h2>");
                
              }
            
    }catch(NullPointerException e){
        out.println(e);
    } 
    %>
    <h1>ArrayList Name</h1>
    <%
    try{
        ArrayList<Name> displayC = (ArrayList) session.getAttribute("thirdString");
        
        for(Name c : displayC){
              out.println("<h2>" + c.getFirstname()+ " "+ c.getLastname()+ "</h2>");
        }
    
    }catch(NullPointerException e){
        out.println(e);
    }    

        %>
        
        <h1> Employee </h1>
        <%
        ArrayList<Employee> displayD = (ArrayList) session.getAttribute("lastString");
        
            for(Employee d : displayD){
             out.println("<h2>" + d.getFirstName()+ " "+ d.getLastName() + " " + d.getAddress() + " " + d.getCity() + " " + d.getZip() + " " + "</h2>");
            
            }
        
        %>
       
    </body>
</html>
