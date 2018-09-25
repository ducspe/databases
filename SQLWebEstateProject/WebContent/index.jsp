<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="bootstrapinclude.jsp"/>
</head>

<body>
	<div class="container">
		
		<h1>Welcome to DIS Project 1</h1>
		<form action="loginprocess.jsp">
			<div class="form-group">
				Username:<input type="text" name="username" class="form-control"/><br/><br/>
				Password:<input type="password" name="password" class="form-control"/><br/><br/>
			<input type="submit" class="btn btn-primary btn-block" value="login"/>
			</div>
		</form>
		<br/>
		<form action="adduserform.jsp">
			<input type="submit" class="btn btn-info btn-block" value="register"/>
		</form>
		
		
	</div>
</body>
</html>


