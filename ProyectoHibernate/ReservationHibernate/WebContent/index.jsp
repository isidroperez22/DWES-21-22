<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.Date"%>
<%@ page import = "java.util.List"%>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "dao.ReservationDAO"%>
<%@ page import = "dao.Hibernate"%>
<%@ page import = "model.Reservation"%>
<%@ page import = "org.hibernate.Session"%>



<%@taglib prefix="fmt" 	uri="http://java.sun.com/jstl/fmt_rt" 						%>
<%@taglib prefix="c" 	uri="http://java.sun.com/jsp/jstl/core" 					%>

<fmt:setBundle basename="interface" />    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title><fmt:message key="title"/></title>
	</head>
	<body>
			<fmt:message key="date"/>: <%= new Date() %>
		<br/>
		
		<%
			
			String username = null;
			Cookie[] cookies = request.getCookies();
			if(cookies !=null){
				for(Cookie cookie : cookies){
				    if(cookie.getName().equals("username")) 
				    	username = cookie.getValue();
				}
			}
				
			if (username != null) {
		%>
				<br/>
				Hi <%=username%>!<br/>
				You've reached this point from Login and your credentials are valid!<br/>
				<p>
					<a href="/ReservationHibernate/LogoutServlet">Logout</a>
				</p><br/>
				
		<%
			}else{
		%>
				<br/>
				<fmt:message key="index.anonymous-user.login.clic.here"/>: <a href="/ReservationHibernate/login.jsp"><fmt:message key="login.login"/></a>
				<br/>								
		<%  }%>
		
		<p>
			Hibernate code part:<br/>
			
			<p>
			<c:forEach var='reservation' items='${ReservationDAO.getReservationHibernate(true,"")}'>
				 
				Classroom:			<c:out value="${reservation.getClassroom()}"></c:out> |
				Reservation date:	<c:out value="${reservation.getReservation_date()}"></c:out> |
				Timetable:			<c:out value="${reservation.getTimetable().getDescription()}"></c:out> |
				Comment:			<c:out value="${reservation.getComment()}"></c:out> |
				
				<!-- you can enable this part of code for get information for reservation object  	 
					Full description:	<c:out value="${reservation.toString()}"></c:out>
				 -->
				<br/><hr/><br/>
			</c:forEach>
			</p>																					
		</p>
		
		
		
	</body>
</html>