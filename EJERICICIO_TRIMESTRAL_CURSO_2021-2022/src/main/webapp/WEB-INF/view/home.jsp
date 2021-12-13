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
			<div class="col-6">
				<c:forEach items="${ProductLines}" var="pl">
					<ul>
						<li>
							<a href = "MostrarProductos?pl=${pl.productLine}">${pl.productLine}</a>
						</li>
					</ul>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>