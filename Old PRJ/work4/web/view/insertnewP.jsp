<%-- 
    Document   : insertnewP
    Created on : 26/04/2022, 10:00:56 AM
    Author     : duynh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function check() {
                document.getElementById("myCheck").checked = true;
            }

            function uncheck() {
                document.getElementById("myCheck").checked = false;
            }
        </script>
    </head>
    <body>
        <form action="insert" method="post">
            ID:<input type="text" name ="pid"/><br>
            Name:<input type="text" name ="pname"/><br>
            Price:<input type="text" name ="pprice"/><br>
            isActive:<input type="checkbox" name="pisActive"/><br>
            importDate: <input type="date" name="pactivedate"/><br>
            Category: 
            <select name="pcata">
                <c:forEach items="${requestScope.catelist}" var="ca">
                    <option value="${ca.cateid}">${ca.catrname}</option>
                </c:forEach>
            </select><br>
            Producer:
            <select name="pprod">
                <c:forEach items="${requestScope.prolist}" var="pr">
                    <option value="${pr.proid}">${pr.proname}</option>
                </c:forEach>
            </select><br>
            <input type="submit" name="add" value="add"/>
        </form>
    </body>
</html>
