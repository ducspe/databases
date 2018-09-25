<%@page import="dao.EstateDao"%>
<jsp:useBean id="u" class="bean.Estate"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
	int i=EstateDao.update(u, String.valueOf(session.getAttribute("username")));
	response.sendRedirect("viewestates.jsp");
%>