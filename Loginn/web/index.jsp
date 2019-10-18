<%-- 
    Document   : index
    Created on : Sep 15, 2019, 11:19:36 PM
    Author     : hongt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Enter information of user:</h1>
        <form action="LoginServlet"method="post">
            Name:    <br><input type="text"name="name"><br>
            Password:<br><input type="password" name="password"><br>
                     <input type="submit"value="login">
        </form>
    </body>
</html>
