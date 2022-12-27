<%-- 
    Document   : Article_list
    Created on : 15/12/2022, 8:42:02 AM
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
        <h1>Session by: ${sessionScope.user.display_name}</h1>
        <c:if test="${requestScope.list ne null}">
            <table border="1px">
                <tr>
                    <td>id</td>
                    <td>title</td>
                    <td>created_date</td>
                    <td>created_by</td>
                </tr>
                <c:forEach items="${requestScope.list}" var="l">
                    <tr>
                        <td>${l.id}</td>
                        <td>${l.title}</td>
                        <td>${l.created_date}</td>
                        <td>${l.created_by}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
