<%-- 
    Document   : login
    Created on : 07/12/2022, 9:29:16 AM
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
