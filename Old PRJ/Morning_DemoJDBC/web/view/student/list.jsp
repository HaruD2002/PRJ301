<%-- 
    Document   : list
    Created on : Apr 13, 2022, 11:49:34 AM
    Author     : Ngo Tung Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var ids = [];
            <c:forEach items="${requestScope.students}" var="s">
            ids.push(${s.id});
            </c:forEach>
            function submitForm()
            {
                document.getElementById('frmSearch').submit();
            }

            function hideEditmode(id)
            {
                var editcomponents = document.getElementsByClassName("editmode" + id);
                for (var i = 0; i < editcomponents.length; i++)
                {
                    var component = editcomponents[i];
                    component.style.display = "none";
                }
            }
            function showEditmode(id)
            {
                var editcomponents = document.getElementsByClassName("editmode" + id);
                for (var i = 0; i < editcomponents.length; i++)
                {
                    var component = editcomponents[i];
                    component.style.display = "block";
                }
            }
            function hideViewmode(id)
            {
                var editcomponents = document.getElementsByClassName("viewmode" + id);
                for (var i = 0; i < editcomponents.length; i++)
                {
                    var component = editcomponents[i];
                    component.style.display = "none";
                }
            }
            function showViewmode(id)
            {
                var editcomponents = document.getElementsByClassName("viewmode" + id);
                for (var i = 0; i < editcomponents.length; i++)
                {
                    var component = editcomponents[i];
                    component.style.display = "block";
                }
            }
        </script>
    </head>
    <body>
        <form method="GET" action="list" id="frmSearch"> 
            Department: <select name="did" onchange="submitForm();">
                <option value="0">----------ALL----------</option>
                <c:forEach items="${requestScope.depts}" var="d">
                    <option 
                        <c:if test="${d.id eq requestScope.did}">
                            selected="selected"
                        </c:if>
                        value="${d.id}">${d.name}</option>
                </c:forEach>
            </select>
        </form>
        <c:if test="${requestScope.students.size() gt 0}">
            <table border="1px">
                <tr>
                    <td>Id</td>
                    <td>Name</td>
                    <td>Gender</td>
                    <td>Dob</td>
                    <td>Department</td>
                    <td></td>
                </tr>
                <c:forEach items="${requestScope.students}" var="s">
                    <form action="update" method="post">   
                        <tr>
                            <td>${s.id}</td>
                            <td><span class="viewmode${s.id}" id="view_name${s.id}">${s.name}</span>
                                <input name="name" class="editmode${s.id}" type="text" id="edit_name${s.id}" value="${s.name}" />
                            </td>
                            <td>
                                <input type="checkbox" <c:if test="${s.gender}">checked="checked"</c:if> />
                                </td>
                                <td>${s.dob}</td>
                            <td>${s.dept.name}</td>
                            <td>
                                <input class="viewmode${s.id}" type="button" onclick="showEditmode(${s.id});hideViewmode(${s.id});" value="Enable Edit"/>
                                <input class="editmode${s.id}" type="button" onclick="hideEditmode(${s.id});showViewmode(${s.id});" value="Cancel"/>
                                <input class="editmode${s.id}" type="submit"  value="Save"/>
                            </td>
                        </tr>
                    </form>
                </c:forEach>
            </table>
        </c:if>
        <c:if test="${requestScope.students.size() eq 0}">
            NO record to display;
        </c:if>

        <script>
            for (var i = 0; i < ids.length; i++)
            {
                hideEditmode(ids[i]);
            }
        </script>
    </body>
</html>
