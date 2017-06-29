<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Called a page directive and effects the entire --%>
	<%-- JSP page. This one used for imports --%> 
	<%@ page import="java.util.Date, gui.*" %> <%-- import classes & objects --%>

	<%-- "<% %>" this is an input tag --%>
	<%-- "<%= %>" this is an output tag --%>
	<%-- "<%@ %>" this is an insert tag --%>
	
	<%=new Date()%>

	<%
		TextOutput textOut = new TextOutput();
	
		out.println(textOut.getInfo());
	%>

</body>
</html>