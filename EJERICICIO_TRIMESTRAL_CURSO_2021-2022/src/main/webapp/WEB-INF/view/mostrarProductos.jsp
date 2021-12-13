<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Productos</title>
</head>
<body>
	<div class="row justify-content-center">
			<div class="col-10">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>CustomerNumber</th>
							<th>CheckNumber</th>
							<th>Date</th>
							<th>Amount</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${prodcutos}" var="p">
							<tr>
								<td>${p.productName}</td>
								<td>${p.productDescription}</td>
								<td>${p.productVendor}</td>
								<td>${p.buyPrice}</td>
								<td>${p.quantityInStock}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>