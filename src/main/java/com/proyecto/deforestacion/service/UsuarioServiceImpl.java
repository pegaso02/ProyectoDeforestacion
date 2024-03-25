package com.proyecto.deforestacion.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.deforestacion.model.Usuarios;
import com.proyecto.deforestacion.repository.UsuarioRepository;
import io.micrometer.common.lang.NonNull;
import jakarta.transaction.Transactional;


@Service
public class UsuarioServiceImpl implements UsuarioService	 {			 /*CLASE IMPLEMENTA USUARIO SERVICE */
	
							/*ATRIBUTO TIPO UsuarioRepository EL CUAL IMPLEMENTA JPA*/
	@Autowired
	private final UsuarioRepository  usuarioRepository;  						
	
							/*CONSTRUCTOR*/
   
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {    				
		this.usuarioRepository = usuarioRepository;
	}
		
							/*METODO PARA GUARDAR USUARIO*/           /*OK*/
	@Override
	public Usuarios  guardarUsuario(Usuarios usuario) {  					
		return usuarioRepository.save(usuario);
	}
	
	@SuppressWarnings("unused")
	public List<Usuarios> guardarVariosUsuarios(List<Usuarios> usuario) {
		return usuarioRepository.saveAll(usuario);
	}

	@Override       /*OK*/
	public List<Usuarios> listarUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	@NonNull    /*OK*/
	public Usuarios obtenerUsuarioPorId(Long id) {
	    return usuarioRepository.findById(id).get();
	}
	
	
	@Override
	@Transactional    /*OK*/
	public Usuarios actualizarUsuario(Long id, Usuarios usuarioDetalles) {
	    Usuarios usuarioExistente = usuarioRepository.findById(id).get();
	            if (usuarioExistente == null) {
	                return null;
	            }
	    usuarioExistente.setNombre(usuarioDetalles.getNombre());
	    usuarioExistente.setEmail(usuarioDetalles.getEmail());
	    usuarioExistente.setApellido(usuarioDetalles.getApellido());
	    usuarioExistente.setCelular(usuarioDetalles.getCelular());
	    usuarioExistente.setContraseña(usuarioDetalles.getContraseña());

	    return usuarioRepository.save(usuarioExistente);
	}

	
	@Override   /*OK*/
	public void eliminarUsuario(Long id, Usuarios usuario) {
		Usuarios usuarioExistente = usuarioRepository.findById(id).get();
		if(usuarioExistente == null) {
			return;
		}
		usuarioRepository.delete(usuarioExistente);
	}

}
