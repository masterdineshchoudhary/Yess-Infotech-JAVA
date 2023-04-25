<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Context-Type" context="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	String name = request.getParameter("uname");
	out.println("Welcome to jsp world " + name);
	%>
</body>
</html>