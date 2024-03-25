package com.proyecto.deforestacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_notificacion")
public class tipoNotificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Tipo_Notificacion")
	private int IdTipoNotificacion;
	
	@Column(name = "Tipo", length = 100)
	private String tipoNotificacion;
	
	@Column(name = "Descripcion", length = 250)
	private String descripcion;
	
	/*
	 * Constructor
	 * */
	public tipoNotificacion() {
		// TODO Auto-generated constructor stub
	}

	public tipoNotificacion(int idTipoNotificacion, String tipoNotificacion, String descripcion) {
		super();
		IdTipoNotificacion = idTipoNotificacion;
		this.tipoNotificacion = tipoNotificacion;
		this.descripcion = descripcion;
	}
	
	/*
	 * Setters And Getters
	 * */
	public int getIdTipoNotificacion() {
		return IdTipoNotificacion;
	}

	public void setIdTipoNotificacion(int idTipoNotificacion) {
		IdTipoNotificacion = idTipoNotificacion;
	}

	public String getTipoNotificacion() {
		return tipoNotificacion;
	}

	public void setTipoNotificacion(String tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	
	
	
}
