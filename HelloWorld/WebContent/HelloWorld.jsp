
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>

	<%
	/* embed java with angle brakets and percent sign */

String text = "Today's date is: ";
	
	/* Using cntrl and the space bar you get a dropdown menu 
	   of pre-defined variables */

out.println(text);

%>

	<%=
	
	/* When you want to output directly to a page add an equals sign 
	   No puctuation for output */

	new java.util.Date()

%>

</body>
</html>