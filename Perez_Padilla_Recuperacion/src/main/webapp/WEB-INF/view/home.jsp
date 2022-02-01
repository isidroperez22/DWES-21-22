<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="include/bootstrap.jsp" />
<title>Home</title>
</head>
<body>
	<div class="container mt-5">
		<jsp:include page="include/barra.jsp" />
		<div class="row justify-content-center mt-5">
			<div class="col-12">
				
				<c:if test="${sessionScope.role eq 'admin'}">
				<div class="row justify-content-end">
					<div class="col-3">
						<a class="btn btn-primary w-100" href="Admin/AddCustomer">AÑADIR CUSTOMER</a>
					</div>
				</div>
		
				<div class="row justify-content-center">
					<div class="col-10">
						<table class="table table-striped table-hover">
							<thead>
							<tr>
								<th>Numero de cliente</th>
								<th>Nombre de cliente</th>
								<th>Nombre del contacto</th>
								<th>Apellidos del contacto</th>
								<th>Telefono</th>
								<th>Opciones</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach items="${customer}" var="c">
								<tr>
									<td>${c.customerNumber}</td>
									<td>${c.customerName}</td>
									<td>${c.contactFirstName}</td>
									<td>${c.contactLastName}</td>
									<td>${c.phone}</td>
									<td><i class="bi bi-pencil-fill"></i></td>
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
								<th>Numero de cliente</th>
								<th>Nombre de cliente</th>
								<th>Nombre del contacto</th>
								<th>Apellidos del contacto</th>
								<th>Telefono</th>
								<th>Opciones</th>
							</tr>
							</thead>
							<tbody>
								<c:forEach items="${customer}" var="c">
								<tr>
									<td>${c.customerNumber}</td>
									<td>${c.customerName}</td>
									<td>${c.contactFirstName}</td>
									<td>${c.contactLastName}</td>
									<td>${c.phone}</td>
									<td><a href="${pageContext.request.contextPath}/CustomerReport?cust=${c.customerNumber}"><i class="bi bi-eye-fill"></i></a></td>
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