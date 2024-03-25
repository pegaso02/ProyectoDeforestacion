package com.proyecto.deforestacion.service;

import java.util.List;
import com.proyecto.deforestacion.model.Usuarios;

public interface UsuarioService {
	
	Usuarios  guardarUsuario(Usuarios usuario);
	List<Usuarios>listarUsuarios();
	Usuarios obtenerUsuarioPorId(Long id);
	public Usuarios actualizarUsuario(Long id, Usuarios usuario);
	public void eliminarUsuario(Long id, Usuarios usuario);

}
