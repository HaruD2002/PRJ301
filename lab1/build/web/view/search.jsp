<%-- 
    Document   : search
    Created on : 02/12/2022, 11:15:50 AM
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
        <form action="search" method="post">
            Department:
            <input type="text" name="department" id="department" onchange="getvalue()"/>
            <input name="submit" type ="submit"/>
        </form>
        <c:if test="${requestScope.Studentlist ne null}">
            <table border="1px">
                <tr>
                    <td>Student</td>
                    <td>Department</td>
                </tr>
                <c:forEach items="${requestScope.Studentlist}" var="s">
                    <tr>
                        <td>${s.sname}</td>
                        <td>${s.did.dname}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
