<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.bitwise.cart.LoginBeans" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h2>${msg}</h2><br><br><br>
<center>
<form:form method="post" commandName="SuccessBeans" action="Cart.jsp">
<table>
<tr><td colspan="2">list of  items avaliable</td>
</tr>
<tr>
<td>
<form:select path="itemList" >
<form:option value="tv">tv</form:option>
<form:option value="pen">pen</form:option>
<form:option value="pencil">pencil</form:option>
<form:option value="toygun">toygun</form:option>
<form:option value="candle">candle</form:option></form:select>
</td></tr>

<tr><td colspan="2"><input type="submit" value="view details" ></td></tr>
</table></form:form></center>
</body>
</html>