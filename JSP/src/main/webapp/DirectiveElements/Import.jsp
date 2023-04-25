<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" isELIgnored="true"%>
   <%@ page errorPage = "myerrorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println(new Date());
	%>
	<br/>
	<%
		Random r = new Random();
		int n = r.nextInt(5);
	%>
	<%= "Random number : " + n %>
	
	<%= 100/0 %>
</body>
</html>