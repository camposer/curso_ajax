function ProductoUtil() {
	var URL_BASE = "/producto/productos";

	this.agregar = function(p, callback) {
		$.ajax(URL_BASE, {
			type: "POST",
			data: JSON.stringify(p), 
			contentType: "application/json"
		}).done(callback);
	};

	this.modificar = function(p, callback) {
		$.ajax(URL_BASE + "/" + p.id, {
			type: "PUT",
			data: JSON.stringify(p), 
			contentType: "application/json"
		}).done(callback);
	};

	this.eliminar = function(id) {
		var pos = buscarPos(id);
		if (pos)
			productos.splice(pos, 1);
	};

	this.obtener = function(id) {
		var pos = buscarPos(id);
		return (pos) ? productos[pos] : null;
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
