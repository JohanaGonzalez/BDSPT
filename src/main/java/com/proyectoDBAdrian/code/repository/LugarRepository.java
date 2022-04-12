package com.proyectoDBAdrian.code.repository;

import com.proyectoDBAdrian.code.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LugarRepository extends JpaRepository <Lugar, Integer> {
    Lugar findByNombre(String nombre);
}
