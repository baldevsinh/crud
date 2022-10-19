<%@ page isELIgnored = "false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<div align="center">
<h3>Student List</h3>
<table border="1">

<tr>
<th>id</th>
<th>name</th>
<th>age</th>
<th>city</th>
<th>Action</th>
</tr>
<c:forEach var="student" items="${student_list}">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.age}</td>
<td>${student.city}</td>
<td>
<a href="edit?id=${student.id}">Edit</a> |
<a href="delete?id=${student.id}" onclick="javascript : return confirm('Are you sure you want to delete this?');">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>
