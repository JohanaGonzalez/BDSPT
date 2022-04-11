package com.proyectoDBAdrian.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectoDBAdrian.code.model.Artefacto;

public interface ArtefactoRepository extends JpaRepository<Artefacto, Integer> {
	Artefacto findByNombre(String nombre);
}
