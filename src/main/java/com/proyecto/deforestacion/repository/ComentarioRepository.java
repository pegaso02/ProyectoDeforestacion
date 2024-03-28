package com.proyecto.deforestacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.deforestacion.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
