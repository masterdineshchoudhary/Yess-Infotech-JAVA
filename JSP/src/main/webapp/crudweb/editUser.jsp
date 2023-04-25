<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="crud.UserDao, crud.UserBean"%>
<body>
	<%
	String id = request.getParameter("id");
	UserBean u = UserDao.getRecordById(Integer.parseInt(id));
	%>

	<form action="editUser1.jsp" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="id"
					value="<%out.print(u.getId());%>" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"
					value="<%out.print(u.getName());%>" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><select name="city" style="width: 155px">
						<option>Nashik</option>
						<option>Pune</option>
						<option>Mumbai</option>
				</select></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"
					value="<%out.print(u.getEmail());%>" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"
					value="<%out.print(u.getPassword());%>" /></td>
			</tr>

			<tr>
				<td><br>
				<input type="submit" value="Update" /></td>
			</tr>
		</table>

	</form>
</body>
</html>