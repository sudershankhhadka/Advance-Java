<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List Form</title>
</head>
<body>
	<h1>User List </h1>
	
	
	<table width="100%">
	
		<thead>
		
		<tr bgcolor="red">
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>User Name</th>
		<th>Password</th>
		<th></th>
		</tr>
		</thead>	
		<tbody>
		
		<c:forEach var="u" items="${ulist}">
	
		<tr bgcolor="yellow">
		<td>${u.fname}</td>
		<td>${u.lname}</td>
		<td>${u.username}</td>
		<td>${u.password}</td>
		<th></th>
		</tr>
		
		</c:forEach>
		</tbody>
	</table>
	
</body>
</html>