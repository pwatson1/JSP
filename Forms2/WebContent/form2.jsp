<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Using the post method is more secure because an unauthorized user 
     cannot access the data through the URL. This data is handled by doPost 
     in the servlet.  -->

<form action="/Forms2/Controller" method="post">

<input type="text" name="user" />

<input type="submit" value="ok" />

</form>

</body>
</html>