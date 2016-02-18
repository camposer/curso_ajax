package service;

import java.util.List;

import model.Producto;

public interface ProductoService {
	void agregarProducto(Producto p);
	void modificarProducto(Producto p);
	void eliminarProducto(Integer id);
	Producto obtenerProducto(Integer id);
	List<Producto> obtenerProductos();
}
