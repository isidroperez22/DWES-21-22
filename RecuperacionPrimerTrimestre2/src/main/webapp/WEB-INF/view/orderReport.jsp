<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<fmt:setBundle basename="interface" />
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center mt-5">
		<jsp:include page="include/barra.jsp"/>
			<h1>Order Report</h1>
			<h3>Order Code: ${order.orderNumber}</h3>
			<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th><fmt:message key="productName"/></th>
							<th><fmt:message key="quantity"/></th>
							<th><fmt:message key="price"/></th>
						</tr>
					</thead>
					<tbody>
						<%-- <c:forEach items="${od}" var="od">
						
							<tr>
								<td>${od.Number}</td>
								<td>${od.quantityOrdered}</td>
								<td>${od.priceEach}</td>
							</tr>
						</c:forEach> --%>
					</tbody>
				</table>
		
		</div>
	</div>
</body>
</html>