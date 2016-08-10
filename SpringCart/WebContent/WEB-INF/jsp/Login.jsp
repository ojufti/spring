<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<title>Login</title>
</head>
<body>
<h2>${error}</h2>
<center>
<form:form method="post" action="Success" commandName="LoginBeans">
<table>
<tr>
<td colspan="2">enter ur credentials</td>
</tr>
<tr><td>username</td><td><form:input path="username" cssClass="error"/></td>
</tr>
<tr><td>password</td><td><form:password path="password" cssClass="error"/></td>
</tr>
<tr><td colspan="2"><input type="submit" value="login" onClick="Validate()"></td></tr>
</table>
</form:form></center></body>
</html>