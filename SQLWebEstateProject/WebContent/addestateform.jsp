<html>
	<head>
		<jsp:include page="bootstrapinclude.jsp"/>
	</head>
	
	<body>
	<div class="container">
		<a href="viewestates.jsp">View All Records</a><br/>
		
		<h1>Add New Estate</h1>
		
		<% String username = String.valueOf(session.getAttribute("username")); %>
		
		<form action="addestate.jsp" method="post">
		<input type="hidden" name="manager" value="<%= username %>"/>
		<table>
		<tr><td>City:</td><td><input type="text" name="city"/></td></tr>
		<tr><td>Postal Code:</td><td><input type="text" name="postalcode"/></td></tr>
		<tr><td>Street:</td><td><input type="text" name="street"/></td></tr>
		<tr><td>Street Number:</td><td><input type="text" name="streetnumber"/></td></tr>
		<tr><td>Square Area:</td><td><input type="text" name="squarearea"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="Add Estate"/></td></tr>
		</table>
		</form>
	
	</div>
	</body>

</html>
