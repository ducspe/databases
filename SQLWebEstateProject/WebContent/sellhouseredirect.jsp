<%@page import="dao.SellHouseDao"%>
<jsp:useBean id="u" class="bean.SellHouse"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	int i = SellHouseDao.save(u);
	if (i == 0) {
		response.sendRedirect("viewestates.jsp");
	} else {
		response.sendRedirect("viewestates.jsp");
	}
%>