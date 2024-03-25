package com.proyecto.deforestacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Usuarios")
	private Long ID_Usuarios;
	
	@Column (name = "nombre", length = 25)
	private String nombre;
	
	@Column(name = "apellido", length = 25)
	private String apellido;
	
	@Column(name = "Celular", length = 15)
	private int Celular;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "Contraseña", length = 100)
	private String Contraseña;
	
	@Column(name = "ID_Rol")
	private int ID_Rol;
	
	/*
	 * Constructor
	 * */
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

	public Usuarios(long iD_Usuarios, String nombre, String apellido, int celular, String email, String contraseña,
			int iD_Rol) {
		super();
		ID_Usuarios = iD_Usuarios;
		this.nombre = nombre;
		this.apellido = apellido;
		Celular = celular;
		this.email = email;
		Contraseña = contraseña;
		ID_Rol = iD_Rol;
	}

	/*
	 * Getters And Setters 
	 * */
	public long getID_Usuarios() {
		return ID_Usuarios;
	}

	public void setID_Usuarios(long iD_Usuarios) {
		ID_Usuarios = iD_Usuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public int getID_Rol() {
		return ID_Rol;
	}

	public void setID_Rol(int iD_Rol) {
		ID_Rol = iD_Rol;
	}
	
	
	
	
	
}
