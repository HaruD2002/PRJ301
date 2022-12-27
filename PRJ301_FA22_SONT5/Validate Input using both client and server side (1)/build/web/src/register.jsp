<%-- 
    Document   : register
    Created on : 29/11/2022, 9:38:25 AM
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
        <table border="1px">
            <tr>
                <td>
                    Username
                </td>
                <td>
                    <input type="text" name="username" id="username">
                </td>
                <td>
                    <span id="validate_username"></span>
                </td>
            </tr>
            <tr>            
                <td>
                    Password
                </td>
                <td>
                    <input type="text" name="password" id="password">
                </td>
                <td>
                    <span id="validate_password"></span>
                </td>
            </tr>
            <tr>            
                <td>
                    Confirm password
                </td>
                <td>
                    <input type="text" name="password" id="password">
                </td>
                <td>
                    <span id="validate_password"></span>
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
            </tr>
        </table>
    </body>
</html>
