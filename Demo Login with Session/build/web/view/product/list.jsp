<%-- 
    Document   : list
    Created on : Dec 5, 2022, 10:19:37 AM
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
         <jsp:include page="../util/userpanel.jsp"></jsp:include>
        <a href="../cart/checkout">Your Shopping Cart
            <c:if test="${sessionScope.cart ne null}">
                (${sessionScope.cart.lines.size()})
            </c:if>
        </a>
        <table>
            <tr>
                <td>Product</td>
                <td></td>
            </tr>
    <c:forEach items="${requestScope.products}" var="p">
            <tr>
                <td>${p.name}</td>
                <td><form action="list" method="POST"> <input type="hidden" value="${p.id}" name="pid"> 
                        <input type="submit" value="Buy"/>
                    </form>
                    </td>
            </tr>
    </c:forEach> 
            </table>
    </body>
</html>
