package com.proyecto.deforestacion.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Comentario")
@Entity
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Comentario")
	private Long ID_Comentario;
	
	@Column(name = "ID_Articulo")
	private Long ID_Articulo;
	
	@Column(name = "ID_Usuario")
	private Long ID_Usuario;
	
	@Column(name = "Contenido", length = 500)
	private String Contenido;
	
	@Column(name = "Fecha_Publicacion")
	private LocalDateTime FechaPublicacion;
	
	/*Constructor*/
	
	public Comentario() {
		super();
	}

	public Comentario(Long iD_Comentario, Long iD_Articulo, Long iD_Usuario, String contenido,
			LocalDateTime fechaPublicacion) {
		super();
		ID_Comentario = iD_Comentario;
		ID_Articulo = iD_Articulo;
		ID_Usuario = iD_Usuario;
		Contenido = contenido;
		FechaPublicacion = fechaPublicacion;
	}

	/*Getters And Setters*/
	
	public Long getID_Comentario() {
		return ID_Comentario;
	}

	public void setID_Comentario(Long iD_Comentario) {
		ID_Comentario = iD_Comentario;
	}

	public Long getID_Articulo() {
		return ID_Articulo;
	}

	public void setID_Articulo(Long iD_Articulo) {
		ID_Articulo = iD_Articulo;
	}

	public Long getID_Usuario() {
		return ID_Usuario;
	}

	public void setID_Usuario(Long iD_Usuario) {
		ID_Usuario = iD_Usuario;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public LocalDateTime getFechaPublicacion() {
		return FechaPublicacion;
	}

	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		FechaPublicacion = fechaPublicacion;
	}
	
	
	
}
