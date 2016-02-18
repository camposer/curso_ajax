package dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import model.Producto;

@Repository
public class ProductoDaoImpl implements ProductoDao {
	private List<Producto> productos = new ArrayList<>();
	private int contador = 1;

	private int buscarPos(Integer id) {
		for (int i = 0; i < productos.size(); i++) {
			Producto p = productos.get(i);
			if (p.getId().equals(id))
				return i;
		}
		return -1;
	}
	
	@Override
	public void agregar(Producto p) {
		p.setId(contador++);
		productos.add(p);
	}

	@Override
	public void modificar(Producto p) {
		int pos = buscarPos(p.getId());
		if (pos >= 0)
			productos.set(pos, p);
	}

	@Override
	public void eliminar(Integer id) {
		int pos = buscarPos(id);
		if (pos >= 0)
			productos.remove(pos);
	}

	@Override
	public Producto obtener(Integer id) {
		int pos = buscarPos(id);
		if (pos >= 0)
			return productos.get(pos);
		else
			return null;
	}

	@Override
	public List<Producto> obtenerTodos() {
		return productos;
	}

}
