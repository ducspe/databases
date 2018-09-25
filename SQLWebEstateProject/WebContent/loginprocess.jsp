
<%@page import="dao.EstateAgentDao"%>
<jsp:useBean id="obj" class="bean.LoginBean" />

<jsp:setProperty property="*" name="obj" />

<%
	boolean status = EstateAgentDao.validate(obj);
	boolean issuperuser = EstateAgentDao.isSuperuser(obj);
	if(issuperuser) {
		session.setAttribute("session","TRUE");
		session.setAttribute("username", obj.getUsername());
		
		response.sendRedirect("viewusers.jsp");
	} 
	else if (status) {
		session.setAttribute("session","TRUE");
		session.setAttribute("username", obj.getUsername());
		
		response.sendRedirect("viewestates.jsp");
		
	}
	else {
		out.print("Sorry, username or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
	}
%>