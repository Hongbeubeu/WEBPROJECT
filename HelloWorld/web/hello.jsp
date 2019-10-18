<%-- 
    Document   : hello
    Created on : Sep 9, 2019, 9:43:15 PM
    Author     : hongt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%= request.getParameter("username") %></h1>
        <h1> <%= request.getParameter("email") %></h1>
    </body>
</html>
