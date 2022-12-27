<%-- 
    Document   : register
    Created on : Nov 29, 2022, 9:37:20 AM
    Author     : sonnt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function validateUsername()
            {
                var username = document.getElementById("username").value;
                var pattern = /^[a-zA-Z0-9]{6,32}$/;
                return pattern.test(username);
            }
            function validate()
            {
                var isPassed = true;
                if (!validateUsername())
                {
                    document.getElementById("validateUsername").innerHTML
                            = "username must constain 6 to 32 characters";
                    isPassed = false;
                }
                if (isPassed)
                {
                    document.getElementById("frmRegister").submit();
                }
            }
        </script>
    </head>
    <body>
        <form action="register" method="POST" id="frmRegister"> 
            <table >
                <tr>
                    <td>Username<td>
                    <td><input type="text" name="username" id="username" /><td>
                    <td><span style="color: red;" id="validateUsername"></span><td>
                <tr/>
                <tr>
                    <td>Password<td>
                    <td><input type="text" name="password" id="password" /><td>
                    <td><span id="validatePassword"></span><td>
                <tr/>
                <tr>
                    <td>Confirm Password<td>
                    <td><input type="text" name="confirm" id="confirm" /><td>
                    <td><span id="validateConfirm"></span><td>
                <tr/>
                <tr>
                    <td colspan="3"><input type="button" onclick="validate();" value="Register"/><td>
                <tr/>
            </table>
        </form>
    </body>
</html>
