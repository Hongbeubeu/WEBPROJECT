<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("<h1>Hello World</h1> </br>");
		out.print("There is a sample </br>");
		int i = 8;
	%>
	Value of i: <%= i %>
</body>
</html>