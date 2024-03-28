package com.proyecto.deforestacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.deforestacion.exception.RecursoNoEncontradoException;
import com.proyecto.deforestacion.model.Articulos;
import com.proyecto.deforestacion.repository.ArticuloRepository;
import jakarta.transaction.Transactional;

@Service
public class ArticuloServiceImpl implements ArticuloService{
	
	@Autowired
	ArticuloRepository articuloRepository;
	
	/*CONSTRUCTOR*/
	
	public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
		this.articuloRepository = articuloRepository;
	}

	/*METODOS*/
	
	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		return articuloRepository.save(articulo);
	}

	@Override
	public List<Articulos> listarArticulos() {
		return articuloRepository.findAll();
	}

	@Override
	public Articulos obtenerArticuloPorId(Long id) {
		Optional<Articulos> articulo = articuloRepository.findById(id);
		if(!articulo.isPresent()) {
			throw new RecursoNoEncontradoException("Articulo no encontrado con id "+id);
		}
		return articulo.get();
	}
	
	@Transactional
	@Override
	public Articulos actualizarArticulo(Long id, Articulos detalles) {
		Articulos existeArticulo = articuloRepository.findById(id).get();
		if(existeArticulo == null) {
			return null;
		}
		existeArticulo.setTitulo(detalles.getTitulo());
		existeArticulo.setContenido(detalles.getContenido());
		existeArticulo.setFecha_Publicacion(detalles.getFecha_Publicacion());
		existeArticulo.setID_Autor(detalles.getID_Autor());
		existeArticulo.setID_Imagen(detalles.getID_Imagen());
		
		
		return articuloRepository.save(existeArticulo);
		
	}

	@Override
	public void eliminarArticulo(Long id) {
		if(articuloRepository.existsById(id)) {
			articuloRepository.deleteById(id);
		} else {
			throw new RecursoNoEncontradoException("Articulo no encontrado con id "+id);
		}
	}





}
