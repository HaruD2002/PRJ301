<%-- 
    Document   : list
    Created on : 07/12/2022, 10:01:15 AM
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <body>
        <div class="container">
            <br>
            <h2>Hello, ${sessionScope.user.username}</h2>
            <c:if test="${requestScope.message eq null}">
                No message yet!
            </c:if>
            <br>
            <table border="1px" class="table table-striped">
                <tr>
                    <td><strong>title</strong></td>
                    <td><strong>date</strong></td>
                    <td><strong>create by</strong></td>
                </tr>
                <c:forEach items="${requestScope.message}" var="m">
                    <tr>
                        <td>${m.title}</td>
                        <td>${m.createdDate}</td>
                        <td>${sessionScope.user.username}</td>
                    </tr>
                </c:forEach>
            </table>
            <br>
            <a href="create-message" class="btn btn-success">Create message</a>
        </div>

    </body>
</html>
