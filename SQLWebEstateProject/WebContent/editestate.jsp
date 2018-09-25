<%@page import="dao.EstateDao"%>
<jsp:useBean id="u" class="bean.Estate"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
	int i=EstateDao.update(u);
	response.sendRedirect("viewestates.jsp");
%>