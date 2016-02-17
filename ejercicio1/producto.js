function Producto(_nombre, _precio) {
	var self = this;

	var id;
	var nombre = _nombre;
	var precio = _precio;
	var cantidad;
				
	self.setId = function(i) { id = i; };
	self.getId = function() { return id; };
	self.setNombre = function(n) { nombre = n; };
	self.getNombre = function() { return nombre; };
	self.setPrecio = function(p) { precio = p; };
	self.getPrecio = function() { return precio; };
	self.setCantidad = function(c) { cantidad = c; };
	self.getCantidad = function() { return cantidad; };

	this.toString = function() {
		return "[ id = " + id +
			", nombre = " + self.getNombre() +
			", precio = " + precio + 
			", cantidad = " + cantidad + " ]";
	};
}

