<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>Helo Spring MVC + JDBC</title>
</head>
<body>
	<a href="<c:url value="/customer-list" />" >List Customer</a><br />
	<h1>View Customer:</h1>	
	Customer ID: ${customer.id} <br/>
	Customer Name: ${customer.name} <br/>
	Customer Address: ${customer.address} <br/>
</body>
</html>