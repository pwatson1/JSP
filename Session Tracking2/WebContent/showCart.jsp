<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="demo.*" %>

<% Cart cart = (Cart)session.getAttribute("cart"); %>

Items in cart: <%= cart == null? "error": cart.getTotalItems() %>

<a href="/Session_Tracking2/Session?action=showCart2">Click here to go to showCart2</a>

</body>
</html>