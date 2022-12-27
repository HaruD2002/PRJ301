<%-- 
    Document   : insertbook
    Created on : 15/04/2022, 10:14:10 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action ="book/insert" method = "post">
              <select name="arthorthing">
                <c:forEach items="${requestScope.listofArthor}" var="a">
                    <option value="${a.id}">${a.name}</option>
                </c:forEach>
            </select>
            <br/>
            <select name="articlething">
                <c:forEach items="${requestScope.listofArticle}" var="ar">
                    <option value="${ar.id}">${ar.name}</option>
                </c:forEach>
            </select>
            <br/>
            Active:
            <input type ="checkbox" name ="Activebook" value = "isActive"/> </br>
            Date:
            <input type = "date" name ="borrowdate" /></br>
            <input type ="submit" value="save"/>
        </form>
    </body>
</html>
