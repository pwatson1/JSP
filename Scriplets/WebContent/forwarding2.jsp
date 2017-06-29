<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello

<p/>

<% 

// manually constructed java forwarding
// request.getRequestDispatcher("index.jsp").forward(request, response); 

/* 
        request.getRequestDispatcher(String arg the page you are going to foward 
        to).foward(request, response ... reference objects); this code works for
        jsp and servlet ... server side transaction
*/

// redirecting
response.sendRedirect("index.jsp");
        		
/*
the redirect starts at the page that made the request but then cause the browser 
to make anothre request from the redirect page ... client side transaction
*/

%>


</body>
</html>