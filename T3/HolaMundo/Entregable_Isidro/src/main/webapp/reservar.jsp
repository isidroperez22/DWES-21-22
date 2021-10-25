<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservar</title>
</head>
<body>
	  <form method="post">
                <label class="form-label" >Fecha de inicio</label>
                <input type="date" class="form-control" name="inicio">
                <label class="form-label" >Fecha de Fin</label>
                <input type="date" class="form-control" name="fin">
                <label class="form-label" >Número de personas</label>
                <input type="number" class="form-control" name="numero">


                <label class="form-label" ><h3 style="color:navy">SERVICIOS</h3></label>
                <div class="row">
                    <div class="col">
                        <input type="checkbox" name="checkbox" value="Wifi"> Wifi<br>
                        <input type="checkbox" name="checkbox" value="Toallas"> Toallas<br>
                        <input type="checkbox" name="checkbox" value="Desayuno"> Desayuno
                    </div>
                    <div class="col">
                        <input type="checkbox" name="checkbox" value="Limpieza"> Limpieza<br>
                        <input type="checkbox" name="checkbox" value="Ruta guiada"> Ruta guiada<br>
                        <input type="checkbox" name="checkbox" value="Sauna"> Sauna
                    </div>
                </div>

                <input type="submit" value="RESERVAR" class="btn btn-primary w-100 mt-3" name="reservar">
            </form>
		
</body>
</html>