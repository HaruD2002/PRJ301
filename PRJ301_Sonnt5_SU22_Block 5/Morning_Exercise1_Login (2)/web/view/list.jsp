<%-- 
    Document   : list
    Created on : Aug 11, 2022, 12:04:46 PM
    Author     : Ngo Tung Son
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
        <jsp:include page="greeting.jsp"/>
        <table border="1px">
            <tr>
                <th>Id</th>
                <th>Content</th>
                <th>From</th>
                <th>To</th>
                <th>Created By</th>
            <tr/>
            <c:forEach items="${requestScope.requests}" var="r">
                <tr>
                    <td>${r.id}</td>
                    <td>${r.content}</td>
                    <td>${r.from}</td>
                    <td>${r.to}</td>
                    <td>${r.createdby.username}</td>
                <tr/>
            </c:forEach>
        </table>
    </body>
</html>
