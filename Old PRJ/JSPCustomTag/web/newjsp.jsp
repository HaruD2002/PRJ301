<%-- 
    Document   : newjsp
    Created on : Apr 25, 2022, 11:01:10 AM
    Author     : Ngo Tung Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="https://your.uri/jsp/tlds/mytags" prefix="mytags"%>

<a href="WEB-INF/tlds/TestTag.tld"></a>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <mytags:formatNumber number="100050.574" format="#,###.00"/><br><br>

    </body>
</html>
