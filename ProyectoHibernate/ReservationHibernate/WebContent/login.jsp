<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib prefix="fmt" 	uri="http://java.sun.com/jstl/fmt_rt" 						%>
<%@taglib prefix="c" 	uri="http://java.sun.com/jsp/jstl/core" 					%>

<fmt:setBundle basename="interface" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/login.css" rel='stylesheet' type='text/css' />
	<title><fmt:message key="login.singin"/></title>
</head>
<body>
	<%
		String err = "";
		if (request.getAttribute("err") != null) {
			err = (String) request.getAttribute("err");
		}
	%>
	
	<div class="login-01">
		<div class="one-login  hvr-float-shadow">
			<div class="one-login-head">
				<img src="images/top-lock.png" alt="" />
				<h1><fmt:message key="login"/></h1>
				
				<span></span>
			</div>
			<form action="LoginServlet" method="post">
				<% String mess="";
				if (request.getAttribute("mess") != null){
					mess= (String) request.getAttribute("mess");%>
				<li style="color: red"><%=mess%></li>	
					<% }%>
				<li style="color: red"><%=err%></li>
				<fmt:message key="login.username"/>
				<li><input type="text" class="text" value=""
					name="username"><a href="#" class=" icon user"></a></li>
				<fmt:message key="login.password"/>
				<li><input type="password" value=""
					name="password"><a href="#" class=" icon lock"></a></li>
				<div class="p-container">
					<label class="checkbox"><input type="checkbox"
						name="checkbox" checked><i></i><fmt:message key="remind_password"/></label>
					<div class="clear"></div>
				</div>
				<div class="submit">
					<input type="submit" value="<fmt:message key="login.singin"/>">
				</div>
			</form>
			<a href="/ReservationHibernate/"><fmt:message key="login.go-home-as-guest"/></a>
		</div>
	</div>

</body>
</html>