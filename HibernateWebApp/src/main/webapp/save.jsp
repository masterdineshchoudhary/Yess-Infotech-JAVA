<%@ page import = "com.webapp.UserDao" %>
<jsp:useBean id="u" class="com.webapp.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"></jsp:setProperty>

<%
	int i = UserDao.save(u);
	if(i>0) {
		response.sendRedirect("success.jsp");
	} else {
		response.sendRedirect("error.jsp");
	}
%>
