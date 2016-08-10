<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="item" class="com.bitwise.cart.ItemDetail"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form>
<table>
<tr><td colspan="2">Item Detail</td></tr>
<tr><td>name</td>
<td><jsp:getProperty name="item" property="Name"></td></tr>
<tr><td>price</td><td><jsp:getProperty property="price" name="item"/></td></tr>
<tr><td>size</td><td><jsp:getProperty property="size" name="item"/></td></tr>
<tr><td>quantity</td><td><jsp:getProperty property="quantity" name="item"/></td></tr>
<tr><td>Quantity to be bought</td><td><input type="number" name="num" maxlength="4"></td>
<tr><td colspan="2"><input type="submit" value="add to cart"></td></tr></table></form></center>
</body>
</html>