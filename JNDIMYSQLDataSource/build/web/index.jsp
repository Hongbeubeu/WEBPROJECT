<%-- 
    Document   : index
    Created on : Sep 20, 2019, 10:14:57 PM
    Author     : hongt
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<sql:query var="listProducts" dataSource="jdbc/MYSQLProductDB">
    SELECT * FROM product;
</sql:query>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users List</title>
    </head>
    <body>
        <div align="center">
            <table border="1" cellpadding="5">
                <caption><h2>List of products</h2></caption>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Quantity</th>
                </tr>
                <c:forEach var="p" items="${listProducts.rows}">
                    <tr>
                        <td><c:out value="${p.product_id}"></c:out></td>
                        <td><c:out value="${p.name}" /></td>
                        <td><c:out value="${p.quantity}" /></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>