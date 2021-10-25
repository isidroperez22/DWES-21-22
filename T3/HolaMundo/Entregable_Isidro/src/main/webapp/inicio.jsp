<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center mt-5">
			<% if (!session.isNew() && session.getAttribute("LOGEADO")!=null && ((boolean)session.getAttribute("LOGEADO")) ) { %>

			<div class="col-3">
				<h1 href="<%= request.getContextPath()+"/Logout" %>"><input
					type="button" class="btn btn-primary w-100" value="Salir"></h1>
					<h1 href="<%= request.getContextPath() %>"><input
					type="button" class="btn btn-primary w-100" value="Volver"></h1>
				
				<img src= "https://i.pinimg.com/originals/cb/71/af/cb71af61a1632e4dae65c2c703d8d995.jpg" width = 1000 height = "550">
					
				
			</div>

			<% } else { %>
			<div class="col-3">
				<h1>CENTRAL DE VIAJES</h1>
				<form method="post">
					<label>Usuario: </label><input name = "usuario" type = "text" required>
					<label>Password: </label><input name = "password" type = "password" required>
					<label>Confirmar password: </label><input name = "confirmar" type = "password" required>
					<label>Email: </label><input name = "email" type = "email">
					<input name="registrarse" type="submit" class="btn btn-primary w-100" value="entrar" required/>
				</form>
			</div>
			<% } %>
		</div>
	</div>
</body>
</html>