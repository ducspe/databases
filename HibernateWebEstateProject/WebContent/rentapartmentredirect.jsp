<%@page import="dao.RentApartmentDao"%>
<jsp:useBean id="u" class="bean.RentApartment"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	int i = RentApartmentDao.save(u);
	if (i == 0) {
		response.sendRedirect("viewestates.jsp");
	} else {
		response.sendRedirect("viewestates.jsp");
	}
%>