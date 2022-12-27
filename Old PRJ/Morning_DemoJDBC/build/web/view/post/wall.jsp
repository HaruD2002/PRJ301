<%-- 
    Document   : wall
    Created on : Apr 18, 2022, 10:17:40 AM
    Author     : Ngo Tung Son
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="view/post/css/wall.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:forEach items="${requestScope.posts}" var="p">
        <div class="container">
            <div class="post_content">${p.account.username}: ${p.content}</div>
            <div class="container_comment">
                <c:forEach items="${p.comments}" var="c">
                <p>${c.account.username}:${c.content}</p>
                </c:forEach>
                <form action="wall" method="POST">
                    <input type="hidden" name="pid" value="${p.id}" />
                    <input type="text" name="content" value=""/> 
                    <input type="submit" value="Add"/>
                </form>
            </div>
        </div>
        </c:forEach>    
    </body>
</html>
