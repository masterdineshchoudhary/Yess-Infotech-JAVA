<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="sample.User"></jsp:useBean>
	<jsp:setProperty name="u" property="*"/>
	
	<jsp:getProperty name="u" property="name"/>
	<jsp:getProperty name="u" property="password"/>
	<jsp:getProperty name="u" property="email"/>
	<%--
	Record<br>
	${param.name };
	${param.password };
	${param.email }; 
	--%>
	
</body>
</html>