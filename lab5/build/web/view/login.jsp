<%-- 
    Document   : login
    Created on : 15/12/2022, 8:14:05 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form method="post" action="login">
            Username:
            <input type="text" name="username"/><br>
            Password:
            <input type="password" name="password"><br><!-- comment -->
            <input type="submit" value="login" name="login"/>
        </form>
    </body>
</html>