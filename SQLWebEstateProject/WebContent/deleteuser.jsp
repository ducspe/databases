<%@page import="dao.EstateAgentDao, bean.EstateAgent"%>

<%
	String id=request.getParameter("id");
	EstateAgent u = EstateAgentDao.getRecordById(Integer.parseInt(id));
	EstateAgentDao.delete(u);
	response.sendRedirect("viewusers.jsp");
%>