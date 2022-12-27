<%-- 
    Document   : list
    Created on : 13/12/2022, 11:05:13 AM
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
        <c:if test="${requestScope.list ne null}">
            <table border="1px">
                <tr>
                    <td>eid</td>
                    <td>Content</td>
                    <td>create date</td>
                    <td>create by</td>
                </tr>
                <c:forEach items="${requestScope.list}" var="l">
                    <tr>
                    <td>${l.eid}</td>
                    <td>${l.content}</td>
                    <td>${l.createed_date}</td>
                    <td>${l.created_by}</td>
                </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
