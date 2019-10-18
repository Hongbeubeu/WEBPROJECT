<%-- 
    Document   : index
    Created on : Sep 16, 2019, 9:56:41 PM
    Author     : hongt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Enter information of user:</h1>
        <form action="RegisterServlet"method="post">
            FirstName:    <br><input type="text"name="firstName"><br>
            LastName:     <br><input type="text"name="lastName"><br> 
            UserName:     <br><input type="text"name="userName"><br>
            Password:<br><input type="password" name="password"><br>
                     <input type="submit"value="add">
        </form>
    </body>
</html>
