<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*, java.util.*, java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
</head>
<body>
	<h1>core tag</h1><br>
	 
	<c:set var="name" value="Hello from JSP World"></c:set>
	<c:out value="${name}"></c:out>
	<c:if test="${5<20}"><h4>True Condition</h4></c:if>
	
	<h1>function tag</h1><br>
	<c:set var="str1" value="java"></c:set>
	length of the string1 is : ${fn:length(str1)}<br>
	length of the string2 is : ${fn:length("programming")}<br>
	
	<h4>Replace</h4>
	<c:set var ="s1" value="Java Programming"/>
	<c:set var ="s2" value="${fn:replace(s1,'Java','JavaScript') }"/>
	Final String is : ${s2}<br>
	
	<c:set var="v1" value="Java Programming"/>
	${fn:substring(v1,0,12)}<br><br>
	
	<c:set var="v1" value="Java Programming"/>
	${fn:toLowerCase(v1)}<br>
	${fn:toUpperCase(v1)}<br>
	
	<h1>SQL tag</h1><br>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost/dineshdb"
		user="root" password="dinesh123"/>
		
	<sql:query dataSource="${db}" var="rs">
	SELECT * from class;
	</sql:query>
	
	<table border="2" width="100%">
		<tr>
			<th>roll</th>
			<th>stuname</th>
			<th>mobile</th>
		</tr>
		
		<c:forEach var="table" items="${rs.rows}">
		<tr>
			<td><c:out value="${table.roll}"/></td>
			<td><c:out value="${table.stuname}"/></td>
			<td><c:out value="${table.mobile}"/></td>
		</tr>
		</c:forEach>
		
	</table>
	
	
	
	
	
</body>
</html>