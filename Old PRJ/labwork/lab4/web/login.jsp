<%-- 
    Document   : login
    Created on : 13/03/2022, 10:42:45 AM
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
        <form action = "loginA" method ="post">
            <table>
                <tr>
                    <td> Username </td>
                    <td> <input type ="text" name ="az" /></td>
                </tr>
                <tr> 
                    <td> Password </td>
                    <td> <input type ="password" name ="pz" /> </td>
            </tr>
            <tr>
                <td></td>
                <td><label><input type ="checkbox" name ="remember" value = "remember"/>Remember me </label></td>
            </tr>
            <tr>
                <td></td>
                <td><input type ="submit" name ="find" value ="Login"/> </td>
            </tr>
            </table>
        </form>
    </body>
</html>
