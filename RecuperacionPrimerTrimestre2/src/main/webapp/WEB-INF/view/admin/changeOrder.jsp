<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/bootstrap.jsp" />
<title>Change Order</title>
</head>
<body>
	<div class="container mt-5">
		<jsp:include page="../include/barra.jsp" />
		<div class="row justify-content-center mt-5">
			<div class="col-6">
				<h3>Order Code: ${order.orderNumber}</h3>
				<form method="post">
				<label for="amount" class="form-label mt-3">CUSTOMER</label>
    				<select class="form-select" id="employee" name="customerNumber">
						<c:forEach  items="${customer}" var="c">
							<option value="${c.customerNumber}"> ${c.customerName}</option>
						</c:forEach>					
					</select>
					<input type="submit" class="btn btn-primary w-100 mt-3" value="Change Customer" />	
				</form>
			</div>
		</div>
	</div>
</body>
</html>