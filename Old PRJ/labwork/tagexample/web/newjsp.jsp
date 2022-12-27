<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "x" uri = "WEB-INF/tlds/newtag_library.tld"%>

<!DOCTYPE html>
<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>JSP Page</title>
   </head>
   <body>
       <x:FormatToVietnameseDate value="${requestScope.date}"/>    
   </body>
</html>