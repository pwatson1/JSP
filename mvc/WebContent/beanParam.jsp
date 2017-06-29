<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user5" class="beans.User" scope="page"></jsp:useBean>

<!-- In jsp:setProperty value="" gives direct access to the password.
     When param="" is used, you can input a parameter in the URL. -->
     
     <!--  Alternatively you can remove the third jsp:setProperty altogether 
     and set property="*" . This allows jsp to 	match any properties in the 
     URL that come from the bean or from post data and set those properties.
     You would key in the URL parameters again. -->

<jsp:setProperty name="user5" property="password" value="opensaysme"/>

<%= user5.getPassword() %>
</body>
</html>