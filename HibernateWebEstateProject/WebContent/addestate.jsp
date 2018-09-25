<%@page import="dao.EstateDao"%>
<jsp:useBean id="u" class="bean.Estate"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	int i = EstateDao.save(u, String.valueOf(session.getAttribute("username")));
	if (i > 0) {
		response.sendRedirect("addestate-success.jsp");
	} else {
		response.sendRedirect("addestate-error.jsp");
	}
%>