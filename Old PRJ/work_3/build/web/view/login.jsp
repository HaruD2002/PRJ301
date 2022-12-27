<%-- 
    Document   : login
    Created on : 25/04/2022, 1:28:21 AM
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
        <form action ="login"  method = "post">
            Username:<input type ="text" name="username"/><br>
            Password:<input type="password" name="password"/><br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
