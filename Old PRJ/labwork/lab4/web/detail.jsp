<%-- 
    Document   : detail
    Created on : 13/03/2022, 10:39:15 AM
    Author     : duynh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controller.account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.loginA"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TO DO title </title>
    </head>
    <body>
        
            <%  
                
                ArrayList<account>   displaylist = (ArrayList<account>)request.getAttribute("user");
                for(account display : displaylist){
                    out.println("hello " + display.getS());
                    break;
                }
                
       %>
      
    </body>
</html>
