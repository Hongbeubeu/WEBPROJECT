<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
	<h1>Enter information of user:</h1>
	<form action="LoginServlet"method="post">
		Name:		<br><input type="text"name="name"><br>
		Password:	<br><input type="password" name="password"><br>
				 	<input type="submit"value="login">
	</form>
	</div>
</body>
</html>