<%-- 
    Document   : insert
    Created on : 13/12/2022, 11:12:53 AM
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
        <h3>Insert</h3>
        <form method="post" action="insert">
            Content:
            <input type="text" name="content"/>
            <p>Tag</p>
            <c:if test="${requestScope.tag_list ne null}">
                <c:forEach  items="${requestScope.tag_list}" var="tg">
                    <input type="checkbox" value="${tg.tid}" name="tag"/>
                    <label>${tg.tname}</label><br>
                </c:forEach>
            </c:if>
            <br>
            <input type="submit" value="Create" name="create"/>
        </form>
    </body>
</html>
