package com.proyecto.deforestacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Roles")
@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Rol")
	private int IdRol;
	
	@Column(name = "Descripcion_Rol", length = 100)
	private String Descripcion_Rol;
	
	/*
	 * Constructor
	 * 
	 * */
	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public Roles(int idRol, String descripcion_Rol) {
		super();
		IdRol = idRol;
		Descripcion_Rol = descripcion_Rol;
	}

	
	/*
	 * Getters and Setters
	 **/
	
	public int getIdRol() {
		return IdRol;
	}

	public void setIdRol(int idRol) {
		IdRol = idRol;
	}

	public String getDescripcion_Rol() {
		return Descripcion_Rol;
	}

	public void setDescripcion_Rol(String descripcion_Rol) {
		Descripcion_Rol = descripcion_Rol;
	}
	
	
}
