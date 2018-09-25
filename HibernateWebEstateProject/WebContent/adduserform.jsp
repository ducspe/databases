<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="bootstrapinclude.jsp"/>
<title>Add User Form</title>
</head>
<body>
<div class="container">
	<% String username=String.valueOf(session.getAttribute("username")); %>
	<% if(username.equals("sudo")){ %> 
		<a href="viewusers.jsp">View All Records</a><br/>
	<% } %>
	<jsp:include page="userform.jsp"></jsp:include>
</div>

</body>
</html>