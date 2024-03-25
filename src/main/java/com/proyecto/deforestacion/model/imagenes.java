package com.proyecto.deforestacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "imagenes")
public class imagenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Imagen")
	private int ID_Imagen;
	
	@Column(name = "URL", length = 200)
	private String URL;
	
	@Column(name= "Descripcion", length = 200)
	private String Descripcion;
	
	@Column(name = "ID_Articulo")
	private int ID_Articulo;
}
