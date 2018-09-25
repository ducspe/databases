<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Estates</title>
<jsp:include page="bootstrapinclude.jsp"/>
</head>
<body>

<%@page import="dao.EstateDao,bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% out.println("You are successfully logged in " + session.getAttribute("username")); %>



<%
	String username = String.valueOf(session.getAttribute("username"));
	List<Estate> list=EstateDao.getAllRecords(username);
	request.setAttribute("list",list);
%>

<div class="container">
	<h1>Estates List</h1>
	<table border="1" width="90%">
	<tr><th>Id</th><th>City</th><th>Postal Code</th><th>Street</th><th>Street Number</th><th>Square Area</th><th>Edit</th><th>Delete</th><th>Sell</th><th>Rent</th></tr>
	<c:forEach items="${list}" var="u">
		<tr><td>${u.getEstate_id()}</td><td>${u.getCity()}</td><td>${u.getPostalcode()}</td><td>${u.getStreet()}</td><td>${u.getStreetnumber()}</td><td>${u.getSquarearea()}</td><td><a href="estateeditform.jsp?id=${u.getEstate_id()}">Edit</a></td><td><a href="deleteestate.jsp?id=${u.getEstate_id()}">Delete</a></td><td><a href="sellhouse.jsp?id=${u.getEstate_id()}">Sell</a></td><td><a href="rentapartment.jsp?id=${u.getEstate_id()}">Rent</a></td></tr>
	</c:forEach>
	</table>
	<br/><a href="addestateform.jsp">Add New Estate</a>
</div>


</body>
</html>