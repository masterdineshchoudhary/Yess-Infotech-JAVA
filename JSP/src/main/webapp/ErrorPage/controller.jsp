<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="myerrorpage.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = (Integer.parseInt(request.getParameter("num1")));
		int num2 = (Integer.parseInt(request.getParameter("num2")));
		int output= num1/num2;
		out.println("division of number is : " + output);
	%>
</body>
</html>