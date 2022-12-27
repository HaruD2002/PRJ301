<%-- 
    Document   : insert
    Created on : 09/12/2022, 10:04:29 AM
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
        <form method="post" action="insert">
            Name: 
            <input type="text" name="aname"/><br>
            dob:
            <input type="date" name="dob"/><br>
            gender:
            <input type="radio" name="gender" id="gender" value="0"/>
            <label for="gender">M</label>
            <input type="radio" name="gender" value="1"/>
            <label for="gender">F</label><br>
            Tid:
            <select name="type" id="type">
                <c:forEach items="${requestScope.type}" var="t">
                    <option value="${t.tid}">${t.tname}</option>
                </c:forEach>
            </select><br>
            <input type="submit" name="save" value="save"/>
        </form>
    </body>
</html>
