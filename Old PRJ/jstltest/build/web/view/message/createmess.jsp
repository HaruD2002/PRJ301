<%-- 
    Document   : createmess
    Created on : 20/04/2022, 10:32:29 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="create" method ="post">
            Content:<input type ="text" name= "mcontent" /><br>
            To:<select name="toAcc">
                
                <c:forEach items="${sessionScope.accs}" var="a"> 
                        <option value="${a.Username}">
                            ${a.Username}
                        </option>  
                    </c:forEach>
            </select><br>
            <input type="submit" value="Save"/>
            
        </form>
    </body>
</html>
