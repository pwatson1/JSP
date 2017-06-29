<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- static include: content changes infrequently ... you don't want to us
     it for things that change frequently because it forces the servlet to 
     recompile the JSP ... because the file is included before the servlet 
     compiles the JSP -->
     
<%@ include file="copywrite.txt" %>

<p/>

<!-- dynamic include: content changes a lot ... dynamic include serves up the JSP 
     first and then it goes back to the server and separately serve up the page 
     record ... i.e ...it creates a second request and send the page include 
     separately to the browser but paces it in the correct place on the page
     because this happens after compilation there is no need to recompile -->
     
<jsp:include page="updates.txt"></jsp:include>

<p/>

<!-- must use static include if code has java in it that we want to access 
     the static include is the only way access it as if it were literally typed
      on the page even though it's coming from somewhere else ... like a cut and 
      paste ... "<jsp:include page"" " can't do that-->
      
<!-- syntactically, just like in java, if you want to reference a variable in 
     java you must define it first -->

<%@ include file="variables.jsp" %> <!-- Definition -->

<%= name %> <!-- Reference -->

<p/>

<!-- must use JSP tag is you don't know which type of file you want 'til runtime -->
<%String id = request.getParameter("id"); %>

<% if(id==null) { %>

<jsp:include page="idNotFound.html"/>

<%}else{ %>

<jsp:include page="idFound.html"/>

<%}%>

</body>
</html>