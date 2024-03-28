package com.proyecto.deforestacion.service;

import java.util.List;
import com.proyecto.deforestacion.model.Comentario;

public interface ComentarioService {
	
		public Comentario guardarComentario(Comentario comentario);
		public List<Comentario> listarTodosLosComentarios();
		public Comentario listarComentarioPorId(Long id);
		public Comentario actualizarComentarioPorId(Long id, Comentario comentario);
		public void eliminarComentarioPorId(Long id);
	
}
