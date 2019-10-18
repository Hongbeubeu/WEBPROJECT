<%-- 
    Document   : register-success
    Created on : Sep 16, 2019, 9:59:00 PM
    Author     : hongt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.UserBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Hello 
            <%  UserBean bean=(UserBean)request.getAttribute("bean");
                      out.print(bean.getFirstName()+" "+bean.getLastName());
        
            %>
        </h1>
            Username: <% out.print(bean.getUserName());%></br>
            Password: <% out.print(bean.getPassword());%>   
    </body>
</html>
