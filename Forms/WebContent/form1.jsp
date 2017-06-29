<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- by making the method of the form get, the parameters actually show up 
     in the URL when you input them. This data is handled by doGet  in the
     servlet. -->
     
<!-- Using the post method is more secure because an unauthorized user 
     cannot access the data through the URL. This data is handled by doPost 
     in the servlet.  -->

<form action="/Forms/Controller" method="get">

<!-- name="" sets the parameter -->

<input type="text" name="user" />

<!-- value="" controls what appears in the object -->

<input type="submit" value="ok" />

</form>

</body>
</html>