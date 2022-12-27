<%-- 
    Document   : confirm_login
    Created on : Aug 10, 2022, 10:53:17 AM
    Author     : Ngo Tung Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var count = 3;
            function counting()
            {
                var span = document.getElementById("timer");
                count--;
                span.innerHTML = count;
                if(count<=0)
                {
                    window.location.href = "index.html";
                }
            }
            setInterval(counting,1000);
        </script>
    </head>
    <body>
        <div>Hello ${requestScope.acc.username}</div>
        <div>Redirect to index.html after <span id="timer">3</span> seconds</div>
    </body>
</html>
