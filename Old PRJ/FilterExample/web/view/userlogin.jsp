<%-- 
    Document   : userlogin
    Created on : 27/04/2022, 8:06:29 AM
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
         <form action="login" method ="post">
            userid: <input type ="text" name="userid"/><br>
            password: <input type="password" name="upassword"/><br>
            <input type="submit" name="Login" value="Login"/>
        
        </form>
    </body>
</html>
