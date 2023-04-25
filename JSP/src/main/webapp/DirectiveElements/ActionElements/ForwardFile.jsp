<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is forward tag</title>
</head>
<body>
	<jsp:forward page="NewFile.jsp">
	<jsp:param value="java" name="uname"/>
	</jsp:forward>
</body>
</html>