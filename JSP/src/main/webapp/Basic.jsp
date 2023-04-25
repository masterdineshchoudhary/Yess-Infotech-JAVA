<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriptlet tag</title>
</head>
<body>
<% 
out.println("This is first jsp page");
out.println("This is demo of scriptlet tag");
%>

<%="This is an expression tag"%>

<%! int m = 8; %>
<%= "number is = " + m %>

<%!
int add(int m, int n) {
	return m+n;
}
%>
<%= "add method value is : "+add(3,6) %>

<br>
<%
int a=40,b=20;
out.println("addition is "+(a+b));
%>
</body>
</html>