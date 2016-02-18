function ProductoUtil() {
	var URL_BASE = "/producto/productos";

	this.agregar = function(p, callback) {
		$.ajax(URL_BASE, {
			type: "POST",
			data: JSON.stringify(p), 
			contentType: "application/json"
		}).done(callback);
//		done(function() { // TODO En este caso el agregar debería retornar el id de lo que acaba de agregar
//			var html = "<tr>";
//			html += "<td>" + p.id + "</td>";
//			html += "<td>" + p.nombre + "</td>";
//			html += "<td>" + p.precio + "</td>";
//			html += "<td><a href='#' onclick='mostrar(" + p.id + ")'>mostrar</a></td>";
//			html += "<td><a href='#' onclick='eliminar(" + p.id + ")'>eliminar</a></td>";
//			html += "</tr>";
//			
//			$(html).appendTo("#tabla-productos tbody");
//		});
	};

	this.modificar = function(p, callback) {
		$.ajax(URL_BASE + "/" + p.id, {
			type: "PUT",
			data: JSON.stringify(p), 
			contentType: "application/json"
		}).done(callback);
	};

	this.eliminar = function(id, callback) {
		$.ajax(URL_BASE + "/" + id, {
			type: "DELETE"
		}).done(callback);
	};

	this.obtener = function(id, callback) {
		$.ajax(URL_BASE + "/" + id, {
			type: "GET",
			dataType: "json",
			async: false
		}).done(callback);
	};

	this.obtenerTodos = function(callback) { 
		var settings = {
			type: 'GET',
			dataType: 'json' // Tipo de respuesta
		};

		var ajax = $.ajax(URL_BASE, settings);
		
		ajax.done(callback);
	};

}
