<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
<jsp:include page="bootstrapinclude.jsp"/>
</head>
<body>

<%@page import="dao.EstateAgentDao,bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%
	List<EstateAgent> list=EstateAgentDao.getAllRecords();
	request.setAttribute("list",list);
%>
<div class="container">
	<h1>Users List</h1>
	<table border="1" width="90%">
	<tr><th>Name</th><th>Address</th><th>Username</th><th>Password</th><th>Edit</th><th>Delete</th></tr>
	<c:forEach items="${list}" var="u">
		<tr><td>${u.getName()}</td><td>${u.getAddress()}</td><td>${u.getUsername()}</td><td>${u.getPassword()}</td><td><a href="editform.jsp?id=${u.getUsername()}">Edit</a></td><td><a href="deleteuser.jsp?id=${u.getUsername()}">Delete</a></td></tr>
	</c:forEach>
	</table>
	<br/><a href="adduserform.jsp">Add New User</a>
	<br/><a href="viewcontracts.jsp">See all Contracts</a>
</div>

</body>
</html>