package com.proyecto.deforestacion.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.deforestacion.exception.RecursoNoEncontradoException;
import com.proyecto.deforestacion.model.Comentario;
import com.proyecto.deforestacion.repository.ComentarioRepository;
import jakarta.transaction.Transactional;

public class ComentarioServiceImpl implements ComentarioService {
	
	private final ComentarioRepository comentarioRepository;
	
	/*Constructor*/
	@Autowired
	public ComentarioServiceImpl(ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}
	
	/*Metodos*/

	@Override
	public Comentario guardarComentario(Comentario comentario) {
		return comentarioRepository.save(comentario);
	}

	@Override
	public List<Comentario> listarTodosLosComentarios() {
		return comentarioRepository.findAll();
	}

	@Override
	public Comentario listarComentarioPorId(Long id) {
		Optional<Comentario> existeComentario = comentarioRepository.findById(id);
		if(!existeComentario.isPresent()) {
			throw new RecursoNoEncontradoException("Comentario No encontrado con el id "+id);
		}
		return existeComentario.get();
		
	}
	
	@Transactional
	@Override
	public Comentario actualizarComentarioPorId(Long id, Comentario comentario) {
		Comentario existeComentario = comentarioRepository.findById(id).get();
		if(existeComentario == null) {
			throw new RecursoNoEncontradoException("Comentario No encontrado con el id "+id);
		}
		
		existeComentario.setID_Usuario(comentario.getID_Usuario());
		existeComentario.setID_Articulo(comentario.getID_Articulo());
		existeComentario.setContenido(comentario.getContenido());
		
		return comentarioRepository.save(existeComentario);
	}

	@Override
	public void eliminarComentarioPorId(Long id) {
		Comentario existeComentario = comentarioRepository.findById(id).get();
		if(existeComentario == null) {
			throw new RecursoNoEncontradoException("Comentario no encontrado con el id "+id);
		}
		comentarioRepository.delete(existeComentario);		
	}

	


	
	
}
