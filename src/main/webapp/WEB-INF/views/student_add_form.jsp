<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<div align="center">
<fieldset>
<legend style="font-size: 100%;" align="center">Add Student Form</legend>
<form action="add_student_action" method="post" modelAttribute="student">
<input type="text" name="name" placeholder="Student Name"/><br>
<input type="text" name="age" placeholder="Age"/><br>
<input type="text" name="city" placeholder="City"/><br>
<input type="submit" value="Add"/>
<input type="reset" value="Clear Form"/>
</form>
</fieldset>
</div> 

</body>
</html>
