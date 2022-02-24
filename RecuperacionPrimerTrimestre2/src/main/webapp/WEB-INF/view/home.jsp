<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="include/bootstrap.jsp" />
<fmt:setBundle basename="interface" />
<title>Home</title>
</head>
<body>
	<div class="container mt-5">
		<jsp:include page="include/barra.jsp" />
		<div class="row justify-content-center mt-5">
			<div class="col-12">
				
				<c:if test="${sessionScope.role eq 'admin'}">
		
				<div class="row justify-content-center">
					<div class="col-10">
						<table class="table table-striped table-hover">
							<thead>
							<tr>
								<th>Order Number</th>
								<th>OrderDate</th>
								<th>ShippedDate</th>
								<th>Status</th>
								<th></th>
							</tr>
							</thead>
							<tbody>
								<c:forEach items="${order}" var="o">
								<tr>
									<td>${o.orderNumber}</td>
									<td>${o.orderDate}</td>
									<td>${o.shippedDate}</td>
									<td>${o.status}</td>
									<td><a href="${pageContext.request.contextPath}/Admin/ChangeOrderCustomer?ord=${o.orderNumber}"><i class="bi bi-people-fill"></i></a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</c:if>
		<c:if test="${sessionScope.role eq 'usuario'}">
		<div class="row justify-content-center">
					<div class="col-10">
						<table class="table table-striped table-hover">
							<thead>
							<tr>
								<th><fmt:message key="orderNumber"/></th>
								<th><fmt:message key="orderDate"/></th>
								<th><fmt:message key="shippedDate"/></th>
								<th><fmt:message key="status"/></th>
								<th></th>
							</tr>
							</thead>
							<tbody>
								<c:forEach items="${order}" var="o">
								<tr>
									<td>${o.orderNumber}</td>
									<td>${o.orderDate}</td>
									<td>${o.shippedDate}</td>
									<td>${o.status}</td>
									<td><a href="${pageContext.request.contextPath}/OrderReport?ord=${o.orderNumber}"><i class="bi bi-eye-fill"></i></a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</c:if>
	</div>
				
</body>
</html>