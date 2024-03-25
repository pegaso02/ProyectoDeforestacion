package com.proyecto.deforestacion.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notificaciones")
public class notificaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Notificaciones")
	private int Id_Notificaciones;
	
	@Column(name = "Id_Usuario")
	private int Id_Usuario;
	
	@Column(name = "Tipo_Notificacion")
	private int Tipo_Notificacion;
	
	@Column(name = "Mensaje")
	private int Mensaje;
	
	@Column(name = "Fecha")
	private LocalDateTime fecha;
	
	@Column(name = "Leida")
	private Boolean Leida;
	
}
