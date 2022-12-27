<%-- 
    Document   : search
    Created on : 12/12/2022, 10:26:25 AM
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
            Search:<input type="text" name="searchvalue"/>
            <input type="submit" value="search">
        </form>

        <c:if test="${requestScope.student_list ne null}">
            <table border="1px">
                <tr>    
                    <td>Sid</td>
                    <td>name</td>
                    <td>gender</td>
                    <td>dob</td>
                </tr>
                <c:forEach items="${requestScope.student_list}" var="sl">
                    <tr>
                        <td>${sl.sid}</td>
                        <td>${sl.name}</td>
                        <td>
                            <c:if test="${sl.gender eq true}">
                                1
                            </c:if>
                            <c:if test="${sl.gender eq false}">
                                0
                            </c:if>
                        </td>
                        <td>${sl.dob}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
