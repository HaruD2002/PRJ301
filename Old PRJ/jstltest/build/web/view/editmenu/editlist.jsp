<%-- 
    Document   : editlist
    Created on : 21/04/2022, 8:40:13 AM
    Author     : duynh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <th>id</th>
                <th>name</th>
                <th>gender</th>
                <th>dob</th>
                <th>department</th> 
                <th>change</th>
            <tr>
                <c:forEach items="${sessionScope.lists}" var="s">
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.gender}</td>
                    
                </c:forEach>
            </tr>
        </table>

    </body>
</html>
