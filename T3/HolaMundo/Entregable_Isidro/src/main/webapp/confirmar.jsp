<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				<p>Fecha Incio:</span><%= ((String)session.getAttribute("inicio")) %></p>
				<p><span class="fw-bold">Fecha Fin:</span><%= ((String)session.getAttribute("fin")) %></p>
				<p><span class="fw-bold">Numero de personas:</span><%= ((String)session.getAttribute("numero")) %></p>
				<h4>Servicios</h4>
				<ul>

					<%
					String[] servicios = (String[]) session.getAttribute("servicio");
					if (servicios.length == 0) {
					%>

					<li>No ha servicios</li>
					<%
					} else {
					%>
						<% for (int i=0;i<servicios.length;i++) { %>
							<li><%= servicios[i] %></li>
						<% } %>
					<%
					}
					%>
				</ul>	
				
</body>
</html>