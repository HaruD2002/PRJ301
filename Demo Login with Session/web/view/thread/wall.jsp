<%-- 
    Document   : wall
    Created on : Dec 1, 2022, 10:15:59 AM
    Author     : sonnt
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
        <c:forEach items="${requestScope.threads}" var="t">
            <div>
                <div>Thread:${t.content}</div>
                <div style="margin-bottom: 5px"> 
                    <c:forEach items="${t.comments}" var="c">
                    ${c.user.displayname}:${c.title}<br/>
                    </c:forEach>
                    <div>
                        <form method="POST" action="wall">
                            <input name="tid" type="hidden" value="${t.id}"/>
                            <input name="title" type="text" /> <input type="submit" value="Save"/>
                        </form>
                    </div>
                </div>
            </div>
        </c:forEach>
    </body>
</html>
