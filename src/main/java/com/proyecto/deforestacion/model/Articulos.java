package com.proyecto.deforestacion.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Articulos")
@Entity
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Articulo")
	private int articulo;
	
	@Column(name = "Titulo", length = 100)
	private String Titulo;
	
	@Column(name = "Contenido", length = 500)
	private String contenido;
	
	@Column(name = "Fecha_Publicacion")
	private LocalDateTime Fecha_Publicacion;
	
	@Column(name = "ID_Autor")
	private int ID_Autor;
	
	@Column(name = "ID_Imagen")
	private int ID_Imagen;
	
	
}
