<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10.07.2020
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Customer</title>
</head>
<body>
<div align="center">
    <h2>New Card</h2>
    <form:form action="save" method="post" modelAttribute="card">
        <table border="0" cellpadding="5">
            <tr>
                <td>Id: </td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td>Number: </td>
                <td><form:input path="number" /></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><form:input path="description" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>

