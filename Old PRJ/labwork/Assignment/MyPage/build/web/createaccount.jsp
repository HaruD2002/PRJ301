<%-- 
    Document   : createaccount
    Created on : 23/03/2022, 7:00:43 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
        <style>
            body{
                background: #81ecec;
            }
            .createacc-container{
                display: table;
                border: white solid 0.1rem;
                background: white;
                position: fixed;
                top:5%;
                left:29%;
                right:35%;
                justify-content: center;               
                flex-direction: column;
                min-height: auto;
                height: 80vh;
                width: 40rem;
                border-radius: 1rem;
                box-shadow: 5px 10px 8px #888888 ;
            }
            .createacc-title{
                text-align: center;
                text-decoration: none;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
                font-weight: 900;

            }
            table{
                padding-top: 5%;
                margin-left: 11%;

            }
            tr.spaceUnder>td {
                padding-bottom: 1em;
            }
            
            .display{
                font-size: 1rem;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }
             input[type=text]{
                width:95%;
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
                width:70%;
                margin-left:20%;
                margin-right:25%;
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
                margin-left: 120%;
                
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
function myFunction() {
  var x = document.getElementById("myInput");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>

    </head>
    <body>
        <div class ="createacc-container">
            <div class ="createacc-title">
                <h1>Create Account </h1>
            </div>
            <div>
                <form  action = "checkCreate" method ="POST">
                    <table>
                        <tr class ="spaceUnder"> 
                            <td><h2 class ="display">Enter New UserName </h2></td>
                            <td><input type="text" name = "userfname" placeholder="First Name"/></td>
                            <td><input type="text" name = "userlname" placeholder="Last Name"/>
                        </tr>
                        <tr class ="spaceUnder">
                            <td><h2 class ="display">Gender </h2></td>
                            <td><select name = "getme">
                                    <option>Male</option>   
                                    <option>Female</option>   
                                </select></td>
                        </tr>
                        <tr class ="spaceUnder">
                            <td><h2 class ="display"> Date of Birth</h2> </td>
                            <td><input type="date" name="uOB" placeholder="EnterDOB"/>
                        </tr>
                        <tr>
                            <td><h2 class ="display">Enter your Email</h2></td>
                            <td><input type="text" name = "uEmail" placeholder="Enter Your Email Here"/></td>
                        </tr>
                        <tr class ="spaceUnder">
                            <td><h2 class ="display">Enter your UserName</h2></td>
                            <td><input type="text" name = "username" placeholder="Enter Your UserName Here"/></td>
                        </tr>
                        <tr class ="spaceUnder">
                            <td><h2 class ="display">Enter your Password</h2></td>
                            <td><input type="password" name = "uPass" placeholder="Enter Your Password Here"/></td>
                        </tr>
                        <tr class ="spaceUnder">
                            <td><input type="submit" name = "createUser" /></td>
                        </tr>
                        
                        <tr class ="spaceUnder lacc">
                            <td><a href = "/MyPage/signin.jsp">Already had account?</a></td>
                        </tr>
                       
                    </table>

                </form>
            </div>
        </div>
    </body>
</html>
