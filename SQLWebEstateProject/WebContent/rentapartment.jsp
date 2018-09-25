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
	String id = request.getParameter("id");
	Estate es = EstateDao.getRecordById(Integer.parseInt(id));

%>
<div class="container">
	<a href="viewestates.jsp">View All Records</a><br/>
	<h1>Rent Form</h1>
	<form action="rentapartmentredirect.jsp" method="post">
	<table>
	<tr><td>Apartment ID:</td><td><input type="text" name="apartment_id" value="<%= id %>" readonly/></td></tr>
	<tr><td>Floor:</td><td><input type="text" name="floor"/></td></tr>
	<tr><td>Rent:</td><td><input type="text" name="rent"/></td></tr>
	<tr><td>Rooms:</td><td><input type="text" name="rooms"/></td></tr>
	<tr><td>Balcony:</td><td><input type="text" name="balcony"/></td></tr>
	<tr><td>Built-in Kitchen:</td><td><input type="text" name="builtinkitchen"/></td></tr>
	
	<tr><td>Person ID:</td><td><input type="text" name="person_id"/></td></tr>
	<tr><td>First Name:</td><td><input type="text" name="firstname"/></td></tr>
	<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
	<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
	
	<tr><td>Date:</td><td><input type="date" name="date"/></td></tr>
	<tr><td>Place:</td><td><input type="text" name="place"/></td></tr>
	
	<tr><td>Start Date:</td><td><input type="date" name="startdate"/></td></tr>
	<tr><td>Duration:</td><td><input type="text" name="duration"/></td></tr>
	<tr><td>Additional Costs:</td><td><input type="text" name="additionalcosts"/></td></tr>
	
	<tr><td colspan="2"><input type="submit" value="Add Rent"/></td></tr>
	</table>
	</form>
</div>
</body>
</html>