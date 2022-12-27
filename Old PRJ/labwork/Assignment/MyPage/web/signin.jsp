<%-- 
    Document   : signin
    Created on : 19/03/2022, 10:25:19 PM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Page</title>
        <style> 
            body{
                background: #81ecec;
            }
            .login-container{
                display: block;
                border: white solid 0.1rem;
                background: white;
                position: fixed;
                top:15%;
                left:37%;
                right:35%;
                justify-content: center;
                height: 30rem;
                width: 25rem;
                border-radius: 1rem;
                box-shadow: 5px 10px 8px #888888 ;
            }
            .login-title{
                text-align: center;
                text-decoration: none;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
                font-weight: 900;

            }

            h1,h3{ 
                font-weight: 500;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }
            .login-detail{
                display: block;
                margin-left: 10%;
            }

            input[type=text]{
                width: 85%;
                font-size: 1em;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }

            input[type=password]{
                width: 85%;
                font-size: 1em;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }

            input[type = submit]{
                background-color: #0984e3;
                border-radius: 0.4rem;
                font-size:1.5em;
                color:white;
                width:50%;
                margin-left:20%;
                margin-right:25%;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }
            a{
                text-decoration: none;
            }
            a:visited 
            {
                text-decoration: none; 
                decoration: none; 
            }
            a:hover{
                text-decoration: underline;
            }
        </style>
        <script>
            function showPass() {
                var x = document.getElementById("show");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>

    </head>
    <body>
        <div class = "login-container">
            <div class = "login-title">
                <h1>LOG IN</h1>
            </div>
            <div class = "login-detail">
                <form action = "checkvalid" method = "post">
                    <h3>Enter Email or UserName</h3>
                    <input type ="text" name = "user"/>
                    <h3>Enter password </h3>
                    <input type ="password" name =" pass" id = "show"/><br><br>
                    <input type="checkbox" onclick="showPass()">Show Password <br><br>
                    <lable><input type ="checkbox" value= "Remembe" name ="remember"/>Remeber me</lable>
                    <br><br>
                    
                    <input type ="submit" value ="Log in" name ="login"/>
                </form>
                ${Accountalert}
                <br><br>
                <div>
                    <a href = "createaccount.jsp">Do not have an account yet?Create now </a>
                </div>
            </div>
        </div>


    </body>
</html>
