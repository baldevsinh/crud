<%@ page isELIgnored = "false"  %>

<%
	String session_username = (String)session.getAttribute("username");
%>



<div>
	<div style="float: right;">
		<% if(session_username == null){ %>
			<a href="${pageContext.request.contextPath}/login">Login</a>
		<% } %>
		
		<% if(session_username != null){ %>
			Welcome <%= session.getAttribute("username") %> |
			<a href="${pageContext.request.contextPath}/logout">Logout</a>
		<% } %>
	</div>
	
	<% if(session_username != null){ %>
		<div style="float: left;">
			<a href="${pageContext.request.contextPath}">Add</a>
			<a href="${pageContext.request.contextPath}/listing">List</a>
		</div>
	<% } %>
</div>

<br>

<header style="background-color: gray;color: white; height: 50px">
	<h1 align="center">CRUD APP</h1>
</header>