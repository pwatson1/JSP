<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- In any scriptlet tag or expression tag in your JSP, there is an object called
     session. The session object in your scriptlet or expression tag allows you to  
     pass data seamlessly between JSP's and servlets. It transfers data in such a 
     way that it tracks your session and as long as the session is active then the 
     session object will be available. -->

<%= session.getMaxInactiveInterval() %>


</body>
</html>