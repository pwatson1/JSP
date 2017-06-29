<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="beans.User" scope="session"></jsp:useBean>

<!-- setting property="*" allows jsp to match any properties in the 
     URL that come from the bean or from post data and set those properties.
     You would key in the URL parameters when no form is available. -->

<jsp:setProperty name="user" property="*"/>

Username: <%= user.getUser() %>
Password: <%= user.getPassword() %>

</body>
</html>