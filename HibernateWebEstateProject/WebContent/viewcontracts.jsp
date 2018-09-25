<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
<jsp:include page="bootstrapinclude.jsp"/>
</head>
<body>

<%@page import="dao.ContractDao,bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%
	List<Contract> list=ContractDao.getAllRecords();
	request.setAttribute("list",list);
%>
<div class="container">
	<h1>Users List</h1>
	<table border="1" width="90%">
	<tr><th>Contract ID</th><th>Date</th><th>Place</th></tr>
	<c:forEach items="${list}" var="u">
		<tr><td>${u.getContract_id()}</td><td>${u.getDate()}</td><td>${u.getPlace()}</td></tr>
	</c:forEach>
	</table>
	
</div>

</body>
</html>