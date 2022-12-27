<%-- 
    Document   : create
    Created on : 07/12/2022, 11:19:17 AM
    Author     : duynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <body>
        <div class="container">
            <br>
            <div class="row">
                <h1>Create post</h1>
            </div>
            <div class="row">
                <form action="create-message" method="post">
                    Title:<input type="text" name="title"/><br><br>
                    Date:<input type="date" name="date"><br><br>
                    <input type="submit" value="Create" name="Create" class="btn btn-success">
                    <a href="list" class="btn btn-secondary">Cancel</a>
                </form>
            </div>
        </div>
    </body>

</html>
