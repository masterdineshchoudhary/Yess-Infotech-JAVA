<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="sample.BeanClass"></jsp:useBean>
	<%
	int res = obj.cube(5);
	out.println(res);
	%>
</body>
</html>