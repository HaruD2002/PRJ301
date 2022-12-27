<%-- 
    Document   : insert
    Created on : 14/04/2022, 3:36:47 AM
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
        <form action = "insert" method = "post"> 
            Name: <input type ="text" name =" "name"/> </br>
            Gender: <input type ="radio" name ="gender" value = "male" checked="checked"/>Male
                    <input type ="radio" name ="gender" value = "female"/>Female</br>
            DOB: <input type="date" name ="dob"/></br>
             Department: <select name="did">
                <c:forEach items="${requestScope.depts}" var="d">
                    <option value="${d.id}">${d.name}</option>
                </c:forEach>
            </select>
            <br/>
            <input type ="submit" value ="save"/>
        </form>
    </body>
</html>
