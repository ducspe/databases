<%@page import="dao.EstateDao, bean.Estate"%>

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
Estate u = EstateDao.getRecordById(Integer.parseInt(id));
%>

<div class="container">
	<h1>Edit Estate Form</h1>
	<form action="editestate.jsp" method="post">
	<input type="hidden" name="estate_id" value="<%= u.getEstate_id() %>"/>
	
	<table>
	<tr><td>City:</td><td><input type="text" name="city" value="<%= u.getCity()%>"/></td></tr>
	<tr><td>Postal Code:</td><td><input type="text" name="postalcode" value="<%= u.getPostalcode()%>"/></td></tr>
	<tr><td>Street:</td><td><input type="text" name="street" value="<%= u.getStreet()%>"/></td></tr>
	<tr><td>Street Number:</td><td><input type="text" name="streetnumber" value="<%= u.getStreetnumber()%>"/></td></tr>
	<tr><td>Square Area:</td><td><input type="text" name="squarearea" value="<%= u.getSquarearea()%>"/></td></tr>
	
	<tr><td colspan="2"><input type="submit" value="Edit Estate"/></td></tr>
	</table>
	</form>
</div>

</body>
</html>