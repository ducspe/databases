<%@page import="dao.EstateAgentDao, bean.EstateAgent"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="bootstrapinclude.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>


<%
String id=request.getParameter("id");
EstateAgent u = EstateAgentDao.getRecordById(Integer.parseInt(id));
System.out.println(u.getAgent_id());
%>
<div class="container">
	<h1>Edit Form</h1>
	<form action="edituser.jsp" method="post">
	<input type="hidden" name="agent_id" value="<%= u.getAgent_id()%>"/>
	<table>
	<tr><td>Name:</td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
	<tr><td>Address:</td><td><input type="text" name="address" value="<%= u.getAddress()%>"/></td></tr>
	<tr><td>Username:</td><td><input type="text" name="username" value="<%= u.getUsername()%>"/></td></tr>
	<tr><td>Password:</td><td><input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
	</table>
	</form>
</div>

</body>
</html>
