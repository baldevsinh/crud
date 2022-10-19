<%@ page isELIgnored = "false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<div align="center">
<fieldset>
<legend style="font-size: 125%;" align="center"><b>Update</b></legend>
<form action="edit_student_action" method="post" modelAttribute="student">
<input type="hidden" name="id" value="${student.id}"/>
Name :<input type="text" name="name" value="${student.name}" placeholder="Student Name"/><br>
Age :<input type="text" name="age" value="${student.age}" placeholder="Age"/><br>
City :<input type="text" name="city" value="${student.city}" placeholder="City"/><br>
<input type="submit" value="Update"/>
</form>
</fieldset>
</div> 

</body>
</html>
