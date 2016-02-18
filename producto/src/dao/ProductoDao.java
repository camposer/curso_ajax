package dao;

import java.util.List;

import model.Producto;

public interface ProductoDao {
	void agregar(Producto p);
	void modificar(Producto p);
	void eliminar(Integer id);
	Producto obtener(Integer id);
	List<Producto> obtenerTodos();
}
