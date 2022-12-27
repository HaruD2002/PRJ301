<%-- 
    Document   : insert
    Created on : Apr 13, 2022, 11:49:25 AM
    Author     : Ngo Tung Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${sessionScope.account.displayname} <br/>
        <form action="insert" method="POST"> 
            Name: <input type="text" name="name"/> <br/>
            Gender : <input type="radio" checked="checked" value="male" name="gender"/> Male 
            <input type="radio" value="female" name="gender"/> Female  <br/>
            Dob: <input type="date" name="dob"/> <br/>
            Department: <select name="did">
                <c:forEach items="${requestScope.depts}" var="d">
                    <option value="${d.id}">${d.name}</option>
                </c:forEach>
            </select>
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
