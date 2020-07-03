<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<title>Ejemplos de CIBERTEC - Jorge Jacinto </title>
</head>

<body> 
<div class="container">
 <h2>Consulta de Plato</h2>
		 <div class="col-md-23" >  
		       <form accept-charset="UTF-8"  action="consultaPlato" class="simple_form" id="defaultForm2"  method="post">
					<div class="row">
						<div class="col-md-3">	
								<select id="id_deporte" name="idPais" class='form-control'>
										<option value=" "> [ Seleccione Deporte ]</option>    
								</select>
						</div>
						<div class="col-md-3">
								<input class="form-control" id="id_nombre" name="nombre" placeholder="Ingrese el nombre" type="text"/>
						</div>
						<div class="col-md-3">
								<input class="form-control" id="id_edad" name="edad" placeholder="Ingrese la edad" type="text" maxlength="2"/>
						</div>
						<div class="col-md-3">
								<button type="submit" class="btn btn-primary" id="validateBtnw1" >FILTRA</button><br>&nbsp;<br>
						</div>
					</div>
					<div class="row" > 
						<div class="col-md-12">
								<div class="content" >
						
									<table id="tableAlumno" class="table table-striped table-bordered" >
										<thead>
											<tr>
												<th>ID</th>
												<th>Nombre</th>
												<th>Precio</th>
												<th>Stock</th>
												<th>Restaurante</th>
												<th>Fecha Vencimiento</th>
												<th>Ingredientes</th>
												<th>Pais</th>
											</tr>
										</thead>
										<tbody>
												   
												<c:forEach items="${platos}" var="x">
													<tr>
														<td>${x.idPlato}</td>
														<td>${x.nombre}</td>
														<td>${x.precio}</td>
														<td>${x.stock}</td>
														<td>${x.restaurante}</td>
														<td>${x.fechaVencimiento}</td>
														<td>${x.ingredientes}</td>
														<td>${x.pais.nombre}</td>
													</tr>
												</c:forEach>
										</tbody>
										</table>	
									
								</div>	
						</div>
					</div>
		 		</form>
		  </div>
  
 </div>

<script type="text/javascript">
$.getJSON("cargaDeporte", {}, function(data){
	$.each(data, function(index,item){
		$("#id_deporte").append("<option value="+item.idDeporte +">"+ item.nombre +"</option>");
	});
});
</script>
    
</body>
</html> 