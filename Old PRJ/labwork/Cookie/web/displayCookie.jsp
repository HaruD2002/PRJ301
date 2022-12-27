<%-- 
    Document   : displayCookie
    Created on : 19/03/2022, 7:21:16 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Cookie[] cookies = request.getCookies();
       if(cookies!=null)
       {
           for (Cookie cooky : cookies) {
               if(cooky.getName().equals("name")){
                   response.getWriter().println(cooky.getValue());
               }
           }
       }
        %>
    </body>
</html>
