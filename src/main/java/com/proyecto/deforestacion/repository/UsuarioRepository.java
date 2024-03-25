package com.proyecto.deforestacion.repository;


import com.proyecto.deforestacion.model.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> { /*Extiende de la interface JPA que tiene metodos CRUD listos para ser usados /*

	/*Buscar Usuario Por Nombre*/
	List<Usuarios>findByNombre(String nombre);
	
	  // Buscar usuarios por apellido
	List<Usuarios> findByApellido(String apellido);
	

}


