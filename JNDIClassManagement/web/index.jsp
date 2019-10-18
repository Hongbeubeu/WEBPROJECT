<%-- 
    Document   : index
    Created on : Sep 20, 2019, 4:33:01 PM
    Author     : hongt
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<sql:query var="listStudents" dataSource="jdbc/ClassManagement">
SELECT FirstName, LastName, Address, Telephone, Email, Password FROM Student;
</sql:query>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Students List</title>
    </head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Students</h2></caption>
            <tr>
                <th>FirstName   </th>
                <th>LastName    </th>
                <th>Address     </th>
                <th>Telephone   </th>
                <th>Email       </th>
                <th>Password    </th>
            </tr>
            <c:forEach var="p" items="${listStudents.rows}">
            <tr>
                <td><c:out value="${p.FirstName}"/> </td>
                <td><c:out value="${p.LastName}"/>  </td>
                <td><c:out value="${p.Address}"/>   </td>
                <td><c:out value="${p.Telephone}"/> </td>
                <td><c:out value="${p.Email}"/>     </td>
                <td><c:out value="${p.Password}"/>  </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
