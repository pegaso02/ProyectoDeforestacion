package com.proyecto.deforestacion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.proyecto.deforestacion.model.Articulos;
import com.proyecto.deforestacion.service.ArticuloService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	
	 private final ArticuloService articuloService;
	
	// Constructor para la inyección de dependencias
	@Autowired
	public ArticuloController(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}
	
	/*Registrar Articulo*/
	@PostMapping /*OK*/
	public ResponseEntity<Articulos> guardarArticulo(@Validated @RequestBody Articulos articulo) {
		Articulos nuevoArticulo = articuloService.guardarArticulo(articulo);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevoArticulo);
	}
	
	/*Listar todos los articulos*/
	@GetMapping  /*OK*/
	public List<Articulos> listarTodosLosArticulos() {
		return articuloService.listarArticulos();
	}
	
	/*Listar Articulos por ID*/
	@GetMapping("/{id}")  /*OK*/
	public Articulos listarArticuloPorId(@PathVariable Long id) {
		return articuloService.obtenerArticuloPorId(id);		
	}
	
	/**
	 * Actualizar Articulo
	 * */
	@PutMapping("/{id}")  /*OK*/
	public void actualizarArticulo(@PathVariable Long id, @RequestBody Articulos articulos) {
		articuloService.actualizarArticulo(id, articulos);
	}
	
	/*Eliminar Articulo*/  /*OK*/
	@DeleteMapping("/{id}")
	public void eliminarArticuloPorId(@PathVariable Long id) {
		articuloService.eliminarArticulo(id);
	}
	
	
	
	
}
