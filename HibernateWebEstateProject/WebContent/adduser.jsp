<%@page import="dao.EstateAgentDao"%>
<jsp:useBean id="u" class="bean.EstateAgent"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	int i = EstateAgentDao.save(u);
	if (i > 0) {
		response.sendRedirect("adduser-success.jsp");
	} else {
		response.sendRedirect("adduser-error.jsp");
	}
%>