package controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Producto;
import service.ProductoService;

@RestController
@RequestMapping("/productos*")
public class ProductoRestController {
	@Autowired
	private ProductoService productoService;
	
	// GET /productos
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Producto> obtenerProductos() {
		return productoService.obtenerProductos();
	}

	// GET /productos/:id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Producto obtener(@PathVariable Integer id) {
		return productoService.obtenerProducto(id);
	}

	// DELETE /productos/:id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void eliminar(@PathVariable Integer id) {
		productoService.eliminarProducto(id);
	}

	// POST /productos
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public void agregar(@RequestBody Producto producto) {
		productoService.agregarProducto(producto);
	}

	// PUT /productos/:id
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public void modificar(@PathVariable Integer id, 
			@RequestBody Producto producto) {
		productoService.modificarProducto(producto);
	}
} 






