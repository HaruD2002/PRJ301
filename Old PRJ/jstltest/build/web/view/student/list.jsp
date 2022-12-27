<%-- 
    Document   : list
    Created on : 14/04/2022, 3:36:57 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function submitform() {
                document.getElementById("frmSearch").submit();

            }
        </script>
    </head>
    <body>
        <form method="GET" action="list" id="frmSearch">
            Department: <select name = "did" onchange="submitform()"> 
                <option value = "0">--------All--------</option>
                <c:forEach items="${requestScope.depts}" var = "d">

                    <option 
                        <c:if test="${d.id eq requestScope.did}"> 
                            selected = "selected"
                        </c:if>
                        value ="${d.id}"> ${d.name}</option>
                </c:forEach>
            </select>
        </form>
        <c:if test="${requestScope.students.size() gt 0}">
        <table border ="1px">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Gender</td>
            <td>DOB </td>
            <td>Department</td> 
        </tr>

        <c:forEach items ="${requestScope.students}" var = "s">   
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>
                    <input type ="checkbox" <c:if test="${s.gender}"> checked="checked" </c:if> />             
                    </td>
                    <td>${s.dob}</td>
                <td>${s.dept.name}</td>
            </tr>

        </c:forEach>
    </table>     
    </c:if>
    
    <c:if test="${requestScope.students.size() eq 0}">
        No record to display
    </c:if>
</body>
</html>
