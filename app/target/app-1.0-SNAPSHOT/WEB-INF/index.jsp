<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
    <title>Online Bank</title>
</head>
<body>
<div align="center">
    <h2>List of Accounts and Cards</h2>
    <!--<form method="get" action="search">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>-->
    <h3><a href="/app_war/new_acc">New Account</a></h3>
    <h3><a href="/app_war/new_card">New Card</a></h3>
    <h3>You are <a href="/app_war/info">${user.firstName} ${user.sirName}</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>Type of product</th>
            <th>ID</th>
            <th>Name</th>
            <th>Number</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listCards}" var="card">
            <tr>
                <td>Card</td>
                <td>${card.id}</td>
                <td>${card.name}</td>
                <td>${card.number}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/description_card?id=${card.id}">See description</a><!-- TO DO -->
                </td>
            </tr>
        </c:forEach>
        <c:forEach items="${listAccounts}" var="account">
            <tr>
                <td>Account</td>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.number}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/description_acc?id=${account.id}">See description</a><!-- TO DO -->
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>