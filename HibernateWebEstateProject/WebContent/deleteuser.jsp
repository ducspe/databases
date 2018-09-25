<%@page import="dao.EstateAgentDao, bean.EstateAgent"%>

<%
	String username = request.getParameter("id");
	EstateAgent u = EstateAgentDao.getRecordById(username);
	EstateAgentDao.delete(u);
	response.sendRedirect("viewusers.jsp");
%>