<%@page import="dao.EstateDao, bean.Estate"%>

<%
	String id=request.getParameter("id");
	Estate u = EstateDao.getRecordById(Integer.parseInt(id));
	EstateDao.delete(u);
	response.sendRedirect("viewestates.jsp");
%>