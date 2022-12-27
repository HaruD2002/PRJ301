<%-- 
    Document   : report
    Created on : Aug 16, 2022, 9:46:36 AM
    Author     : Ngo Tung Son
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/report.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="dth" class="helper.DateTimeHelper" />
        <table border="1px">
            <tr>
                <td></td>
                <c:forEach items="${requestScope.dates}" var="d">
                    <td
                        <c:if test="${dth.getDayOfWeek(d) eq 1 or dth.getDayOfWeek(d) eq 7}">
                            class="sunday" 
                        </c:if>
                        >
                        <fmt:formatDate pattern = "dd" 
                                        value = "${d}" /> <br/>
                        <fmt:formatDate pattern = "EEE" 
                                        value = "${d}" />
                    </td>
                </c:forEach>
                <td>Hours</td>
                <td>Days</td>
                <td>Sicks</td>
            </tr>
            <c:forEach items="${requestScope.emps}" var="e">
                <tr>
                    <td>${e.name}</td>
                    <c:forEach items="${requestScope.dates}" var="d">
                        <td 
                            <c:if test="${dth.getDayOfWeek(d) eq 1 or dth.getDayOfWeek(d) eq 7}">
                                class="sunday" 
                            </c:if>
                            >
                            <c:forEach items="${e.timesheets}" var="t">
                                <c:if test="${d eq t.cidate}">
                                    ${t.getWorkingHours()}
                                </c:if>
                            </c:forEach>
                            <c:forEach items="${e.requests}" var="r">
                                <c:if test="${d >= r.from and d<=r.to}">
                                    <c:choose>
                                        <c:when test = "${r.reason eq 1}">
                                            o
                                        </c:when>
                                    </c:choose>
                                </c:if>
                            </c:forEach>
                        </td>
                    </c:forEach>
                    <td>${e.getWorkingHours()}</td>
                    <td>${e.getWorkingDays()}</td>
                    <td>${e.getTotalLeaves()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
