<%-- 
    Document   : edit
    Created on : Aug 15, 2022, 11:22:49 AM
    Author     : Ngo Tung Son
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function switchToEditMode(id)
            {
                var view_controls = document.getElementsByClassName("view_control" + id);
                for (var i = 0; i < view_controls.length; i++) {
                    view_controls[i].style.display = "none";
                }
                var edit_controls = document.getElementsByClassName("edit_control" + id);
                for (var i = 0; i < edit_controls.length; i++) {
                    edit_controls[i].style.display = "block";
                }
            }
            function switchToViewMode(id)
            {
                var view_controls = document.getElementsByClassName("view_control" + id);
                for (var i = 0; i < view_controls.length; i++) {
                    view_controls[i].style.display = "block";
                }
                var edit_controls = document.getElementsByClassName("edit_control" + id);
                for (var i = 0; i < edit_controls.length; i++) {
                    edit_controls[i].style.display = "none";
                }
            }
            
            function onchange_editname(id)
            {
                var control = document.getElementById("dname_edit"+id);
                var edit = document.getElementById("hname_edit"+id);
                edit.value = control.value;
            }
            
            function onchange_editmaster(id)
            {
                var control = document.getElementById("mid_edit"+id);
                var edit = document.getElementById("hmid_edit"+id);
                edit.value = control.value;
            }
            
            function onchange_editavai(id)
            {
                var control = document.getElementById("avai_edit"+id);
                var edit = document.getElementById("havai_edit"+id);
                if(control.checked)
                {
                   edit.value = control.value;
                }
                else
                    edit.value = "";
                
            }

        </script>
    </head>
    <body>
        <table border="1px" width="700px">
            <tr>
                <td>Name</td>
                <td>Master</td>
                <td>Available</td>
                <td></td>
            </tr>
            <c:forEach items="${requestScope.details}" var="d">
                
                <tr>
                    <td><span id="dname_view${d.id}" class="view_control${d.id}">${d.name}</span>
                        <input onchange="onchange_editname(${d.id})" class="edit_control${d.id}" id="dname_edit${d.id}" type="text" value="${d.name}" style="display: none;"/></td>
                    <td>
                        <span class="view_control${d.id}">${d.master.name}</span>
                        <select onchange="onchange_editmaster(${d.id})" class="edit_control${d.id}" id="mid_edit${d.id}" style="display: none;">
                            <c:forEach items="${requestScope.masters}" var="m">
                                <option value="${m.id}" 
                                        ${m.id eq d.master.id?"selected=\"selected\"":""} 
                                        >${m.name}</option>
                            </c:forEach>
                        </select>
                    </td>
                    <td><span class="view_control${d.id}">${d.avai}</span>
                        <input onchange="onchange_editavai(${d.id})" class="edit_control${d.id}" ${d.avai?"checked=\"checked\"":""} id="avai_edit${d.id}" type="checkbox" value="avai" style="display: none;"/>
                    </td>
                    <td><input class="view_control${d.id}" type="button" class="view_control${d.id}" onclick="switchToEditMode(${d.id})" value="Edit"/>
                        <form action="edit" method="POST">
                            <input type="hidden" name="did" value="${d.id}" />
                            <input id="hname_edit${d.id}" type="hidden" name="dname" value="${d.name}" />
                            <input id="hmid_edit${d.id}" type="hidden" name="mid" value="${d.master.id}" />
                            <input id="havai_edit${d.id}" type="hidden" name="avai" value="${d.avai?"avai":""}" />
                            <input class="edit_control${d.id}" type="submit"  value="Save" style="display: none;"/>
                        </form>
                        <input class="edit_control${d.id}" type="button" onclick="switchToViewMode(${d.id})" value="Cancel" style="display: none;"/>
                    </td>
                </tr>   
                
            </c:forEach>
        </table>
    </body>
</html>
