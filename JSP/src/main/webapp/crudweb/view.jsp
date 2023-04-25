<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="crud.UserDao, crud.UserBean, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<h1>User List</h1>
	<%
	List<UserBean> list = UserDao.getAllRecords();
	request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>City</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getName()}</td>
				<td>${u.getPassword()}</td>
				<td>${u.getEmail()}</td>
				<td>${u.getCity()}</td>
				<td><a href="editUser.jsp?id=${u.getId()}">Edit</a></td>
				<td><a href="deleteUser.jsp?id=${u.getId()}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	<br />
	<a href="index.jsp">Add New User</a>

</body>
</html>