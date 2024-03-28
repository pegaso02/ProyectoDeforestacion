package com.proyecto.deforestacion.service;

import java.util.List;

import com.proyecto.deforestacion.model.Articulos;

public interface ArticuloService {
	
	public Articulos guardarArticulo(Articulos articulo);   /*Registrar articulo*/
	public List<Articulos> listarArticulos();
	public Articulos obtenerArticuloPorId(Long id);
	public Articulos actualizarArticulo(Long id, Articulos detalles);
	public void eliminarArticulo(Long id);
	
}
