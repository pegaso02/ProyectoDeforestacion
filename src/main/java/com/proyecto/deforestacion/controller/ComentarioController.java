package com.proyecto.deforestacion.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.deforestacion.model.Comentario;
import com.proyecto.deforestacion.service.ComentarioService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/comentario")
public class ComentarioController {
	
	ComentarioService comentarioService;

	@PostMapping
	public Comentario guardarComentario(Comentario comentario) {
		return comentarioService.guardarComentario(comentario);
	}
	
	@GetMapping("/{id}")
	public Comentario listarComentarioPorId(@RequestParam Long id) {
		return comentarioService.listarComentarioPorId(id);
	}
	
	@GetMapping
	public List<Comentario> listarTodosLosComentarios(){
		return comentarioService.listarTodosLosComentarios();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Comentario> actualizarComentarioPorId(@PathVariable Long id, @RequestBody Comentario comentario) {
		Comentario comentarioActualizado = comentarioService.actualizarComentarioPorId(id, comentario);
		return ResponseEntity.ok(comentarioActualizado);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarComentarioPorId(Long id){
		comentarioService.eliminarComentarioPorId(id);
	}
	
	
	
}
