<%-- 
    Document   : checkout
    Created on : Dec 5, 2022, 10:19:44 AM
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
        <c:forEach items="${sessionScope.cart.lines}" var="line">
            <div>
                ${line.product.name} - 
                ${line.quantity} - 
                ${line.unitprice}
            </div>
        </c:forEach>
        ${sessionScope.cart.getTotal()}
    </body>
</html>
