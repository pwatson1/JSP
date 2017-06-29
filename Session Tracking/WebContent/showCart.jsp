<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<!-- showCart.jsp imports the appropriate package for the cart -->

<%@ page import="demo.*" %>

<!-- showCart.jsp gets the cart from the session and casts it to the right 
     type of object -->

<% Cart cart = (Cart)session.getAttribute("cart"); %>

<!-- Use a method of the cart object to show data from the object. -->

Items in cart: <%= cart.getTotalItems() %>

</body>
</html>