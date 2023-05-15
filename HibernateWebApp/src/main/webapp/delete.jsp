<%@ page import="com.webapp.UserDao" %>
<jsp:useBean id="u" class="com.webapp.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
	
<%
	UserDao.delete(u);
	response.sendRedirect("view.jsp");
%>