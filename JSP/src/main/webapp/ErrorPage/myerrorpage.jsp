<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>JSP PAGE</title>
</head>
<body>
	<h2>Sorry an exception occured!</h2>
	<%= exception.toString() %>
</body>
</html>