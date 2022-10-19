<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div align="center">
		<fieldset>
		<legend style="font-size: 150%;" align="center">Login Form</legend>
			<form action="login_action" method="post">
				<input type="text" name="username" placeholder="UserName" autocomplete="off""/><br>
				<input type="password" name="password" placeholder="Password" autocomplete="off"/><br>
				<input type="submit" value="Login"/>
			</form>
		</fieldset>
	</div> 


</body>
</html>





