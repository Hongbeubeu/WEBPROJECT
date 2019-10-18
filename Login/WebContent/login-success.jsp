<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login success</title>
</head>
<body>
<div>
	<p>You are successfully logged in!</p>
	<%  UserBean bean=(UserBean)request.getAttribute("bean");
		out.print("Welcome, "+bean.getName()); 
	%>
</div>
</body>
</html>