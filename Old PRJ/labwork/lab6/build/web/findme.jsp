<%-- 
    Document   : findme
    Created on : 23/03/2022, 5:47:51 AM
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
        <table>
            <%
                try{int p  = (int)request.getAttribute("end");
            out.println(p);}
                 catch(Exception e){
                 out.print(e);
                 }
            %>
           
        </table>
        <c:forEach begin="1" end = "${end}" var = "i">
            <a href= "#"> ${i}</a>
        </c:forEach>
        
    </body>
</html>
