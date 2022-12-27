<%-- 
    Document   : TimeSheet
    Created on : 23/08/2022, 5:57:01 AM
    Author     : duynh
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <style>
            html,body {
                margin: 20px;
                padding: 0;
                height: 100%;
            }

            body {
                display: flex;
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
                font-size: 90%;
                color: #333;
                justify-content: center;
            }

            .table-wrapper {
                max-width: 700px;
                overflow: scroll;
            }

            table {
                position: relative;
                border: 1px solid #ddd;
                border-collapse: collapse;
            }

            td, th {
                white-space: nowrap;
                border: 1px solid #ddd;
                padding: 20px;
                text-align: center;
            }

            th {
                background-color: #eee;
                position: sticky;
                top: -1px;
                z-index: 2;

        </style>

    </head>

    <body>
        <div class="table-wrapper">
            <table>
                <thead>
                    <tr>
                        <th></th>
                            <c:forEach items="${getEmpinfo}" var="e">
                            <th><c:out value = "${e.timesheet}"></c:out></th>
                            </c:forEach>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${getEmpinfo}" var="ex">
                    <tr>
                        <td><c:out value = "${ex.empname}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                        <td><c:out value = "${ex.timesheet}"/><br><c:out value = "${ex.timesheet}"/></td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
