<%-- 
    Document   : forget
    Created on : Aug 10, 2022, 11:40:15 AM
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
        <form action="forget" method="POST">
            Username: <input type="text" name="username" /> <br/>
            Question:
            <select name="qid">
                <c:forEach items="${requestScope.questions}" var="q">
                    <option value="${q.id}">${q.content}</option>
                </c:forEach>
            </select> <br/>
            Answer: <input type="text" name="answer" /> <br/>
            <input type="submit" value="Request" /> <br/>
        </form>
    </body>
</html>
