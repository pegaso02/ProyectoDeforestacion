package com.proyecto.deforestacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.deforestacion.model.Articulos;

public interface ArticuloRepository extends JpaRepository<Articulos, Long> {

}
