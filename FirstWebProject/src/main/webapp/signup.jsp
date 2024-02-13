<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="login.jsp">ok</a>
	<form action = "signupServlet" method = "post">
	First Name : <input type="text" name =  "fname"><br><br>
	Last Name : <input type="text"  name = "lname"><br><br>
	
	Username : <input type="text" name="username"> <br><br>
	Password : <input type="password" name ="password"> 
	<hr>
	<input type="submit" value = "signup">
	</form>
</body>
</html>