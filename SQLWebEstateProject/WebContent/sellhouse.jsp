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
	<h1>Sale Form</h1>
	<form action="sellhouseredirect.jsp" method="post">
	<table>
	<tr><td>House ID:</td><td><input type="text" name="house_id" value="<%= id %>" readonly/></td></tr>
	<tr><td>Floors:</td><td><input type="text" name="floors"/></td></tr>
	<tr><td>Price:</td><td><input type="text" name="price"/></td></tr>
	<tr><td>Garden:</td><td><input type="text" name="garden"/></td></tr>
	
	<tr><td>Person ID:</td><td><input type="text" name="person_id"/></td></tr>
	<tr><td>First Name:</td><td><input type="text" name="firstname"/></td></tr>
	<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
	<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
	
	<tr><td>Date:</td><td><input type="date" name="date"/></td></tr>
	<tr><td>Place:</td><td><input type="text" name="place"/></td></tr>
	
	<tr><td>No of Installments:</td><td><input type="text" name="noOfInstallments"/></td></tr>
	<tr><td>Interest Rate:</td><td><input type="text" name="interestrate"/></td></tr>
	
	<tr><td colspan="2"><input type="submit" value="Add Sell"/></td></tr>
	</table>
	</form>
</div>
</body>
</html>