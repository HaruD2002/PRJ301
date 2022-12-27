<%-- 
    Document   : CreateReservation
    Created on : 27/04/2022, 8:38:18 AM
    Author     : duynh
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
        <form action="add" method="post">
            Customer:
            <select name="cuss">
                <c:forEach items="${sessionScope.displayCustomer}" var="c">
                    <option value="${c.cusid}">${c.cusname}</option>
                </c:forEach>
            </select><br>
            Room:
            <select name="rooms">                
                <c:forEach items="${sessionScope.displayRoom}" var="r">
                    <option value="${r.rid}">${r.rname}</option>
                </c:forEach>
            </select><br>
            From:<input type="date" name="fromDate"/>
            To:<input  type="date" name="toDate"/>
            <br>
            <input type="submit" value="Save" name="Save"/>
        </form>
    </body>
</html>
