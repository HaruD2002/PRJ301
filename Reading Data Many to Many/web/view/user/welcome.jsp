<%-- 
    Document   : welcome
    Created on : Nov 29, 2022, 10:26:43 AM
    Author     : sonnt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        Hello ${requestScope.account.username} 
        <div id="counter">3</div>
        <script> 
            var counter = 3;
            
            
            function count()
            {
                var divCounter = document.getElementById("counter");
                counter -=1;
                divCounter.innerHTML = counter;
                if(counter === 0)
                    window.location.href = 'http://www.dantri.com.vn';
            }
            setInterval(count,1000);
        </script>
    </body>
</html>
