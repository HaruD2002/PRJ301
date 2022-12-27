<%-- 
    Document   : userpanel
    Created on : Dec 6, 2022, 10:11:52 AM
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
        <c:if test="${sessionScope.account ne null}">
            Hello, ${sessionScope.account.displayname}
        </c:if>
        <c:if test="${sessionScope.account eq null}">
            You did not login yet!
        </c:if>
    </body>
</html>
