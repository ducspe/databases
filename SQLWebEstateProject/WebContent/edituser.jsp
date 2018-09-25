<%@page import="dao.EstateAgentDao"%>
<jsp:useBean id="u" class="bean.EstateAgent"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
	int i=EstateAgentDao.update(u);
	response.sendRedirect("viewusers.jsp");
%>