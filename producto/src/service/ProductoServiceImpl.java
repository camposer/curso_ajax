package service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductoDao;
import model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoDao productoDao;
	
	@PostConstruct
	public void init() {
		productoDao.agregar(new Producto("TV", 600d));
		productoDao.agregar(new Producto("Cámaras", 200d));
		productoDao.agregar(new Producto("DVD", 300d));
	}
	
	@Override
	public void agregarProducto(Producto p) {
		productoDao.agregar(p);
	}

	@Override
	public void modificarProducto(Producto p) {
		productoDao.modificar(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		productoDao.eliminar(id);
	}

	@Override
	public Producto obtenerProducto(Integer id) {
		return productoDao.obtener(id);
	}

	@Override
	public List<Producto> obtenerProductos() {
		return productoDao.obtenerTodos();
	}
	
}
