package com.proyecto.deforestacion.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Table(name = "Articulos")
@Entity
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Articulo")
	private Long ID_Articulo;
	
	@Column(name = "Titulo", length = 100)
	private String Titulo;
	
	@Lob
	@Column(columnDefinition = "TEXT",  name = "Contenido", length = 500)
	private String Contenido;
	
	@Column(name = "Fecha_Publicacion")
	private LocalDateTime Fecha_Publicacion;
	
	@Column(name = "ID_Autor")
	private int ID_Autor;
	
	@Column(name = "ID_Imagen")
	private int ID_Imagen;
	
	/*
	 * Constructor
	 * */
	
	public Articulos() {
		
	}

	public Articulos(Long iD_Articulo, String titulo, String contenido, LocalDateTime fecha_Publicacion, int iD_Autor,
			int iD_Imagen) {
		super();
		ID_Articulo = iD_Articulo;
		Titulo = titulo;
		Contenido = contenido;
		Fecha_Publicacion = fecha_Publicacion;
		ID_Autor = iD_Autor;
		ID_Imagen = iD_Imagen;
	}
	
	/*
	 * Setters and getters
	 * */
	
	public Long getID_Articulo() {
		return ID_Articulo;
	}

	public void setID_Articulo(Long iD_Articulo) {
		ID_Articulo = iD_Articulo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public LocalDateTime getFecha_Publicacion() {
		return Fecha_Publicacion;
	}

	public void setFecha_Publicacion(LocalDateTime fecha_Publicacion) {
		Fecha_Publicacion = fecha_Publicacion;
	}

	public int getID_Autor() {
		return ID_Autor;
	}

	public void setID_Autor(int iD_Autor) {
		ID_Autor = iD_Autor;
	}

	public int getID_Imagen() {
		return ID_Imagen;
	}

	public void setID_Imagen(int iD_Imagen) {
		ID_Imagen = iD_Imagen;
	}
	


}

