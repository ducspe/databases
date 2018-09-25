<!DOCTYPE html>
<html>
<head>
<jsp:include page="bootstrapinclude.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Success</title>
</head>
<body>

<div class="container">
	<p>Record successfully saved!</p>
	<form action="loginprocess.jsp">
		Username:<input type="text" name="username"/><br/><br/>
		Password:<input type="password" name="password"/><br/><br/>
	<input type="submit" class="btn btn-info" value="login"/>
	</form>
</div>

</body>
</html>