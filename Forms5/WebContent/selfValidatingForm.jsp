<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- Step 3 --%>
	<jsp:useBean id="user1" class="beans.User" scope="session"></jsp:useBean>
	
	<!-- Beans need properties -->
	
	<!-- The asterisk knows which values to set based on what set methods are in 
	     the bean. -->
	
	<%-- Step 3 --%>
	<jsp:setProperty name="user1" property="*"/>
	
	<%-- Try to validate the user and give the validation msg from the controller --%>
	<%
		String action = request.getParameter("action");

		if (action != null && action.equals("formsubmit")) {

			if (user1.validate()) {
				request.getRequestDispatcher("/Controller").forward(request, response);
			}

		}
	%>

	<h2><jsp:getProperty name="user1" property="message" /></h2>
	
	<!-- This form submits to itself. The action just submits to the page its on 
	     which is fine. It doesn't cause any conflict. -->

	<%-- Step 1 --%>
	<form action="/Forms5/selfValidatingForm.jsp" method="post">
	
	    <%-- This is a flag that allows the controller to keep track of if a
             form has been submitted --%>
             
		<input type="hidden" name="action" value="formsubmit" /> 
		
		<!-- The getProperty JSP element gets its data from the get method of
		     the same name in the bean  -->
		
		<%-- Step 2 key in data --%>	<%-- Step 4 --%>
		<input type="text" name="email" value="<jsp:getProperty name="user1" property="email" />" /><br /> 
		<input type="text" name="password"value="<jsp:getProperty name="user1" property="password" />" /><br />
		<input type="submit" name="ok" />

	</form>

</body>
</html>