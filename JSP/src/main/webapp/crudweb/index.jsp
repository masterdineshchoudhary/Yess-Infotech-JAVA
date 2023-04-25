<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
<style>
table, td {
	border-color: white;
	border-style: solid;
}</style>

</head>
<body>
	<a href="view.jsp">View All Record</a>
	<h1>Add User</h1>
	<form action="addUser.jsp" method="post">
		<table>
			<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
			<tr><td>City:</td><td>
				<select name="city" style="width:155px">
				<option>Nashik</option>
				<option>Pune</option>
				<option>Mumbai</option>
				</select>
			</td></tr>
			<tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
			<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
			
			<tr><td><br><input type="submit" value="Add"/></td></tr>
		</table>
	</form>
</body>
</html>