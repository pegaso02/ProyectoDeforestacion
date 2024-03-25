package com.proyecto.deforestacion.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "comentarios")
@Entity
public class comentarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Comentario")
	private int ID_Comentario;
	
	@Column(name = "ID_Articulo")
	private int ID_Articulo;
	
	@Column(name = "ID_Usuario")
	private int ID_Usuario;
	
	@Column(name = "Contenido")
	private int Contenido;
	
	@Column(name = "Fecha_Publicacion")
	private LocalDateTime FechaPublicacion;
	
	
}
