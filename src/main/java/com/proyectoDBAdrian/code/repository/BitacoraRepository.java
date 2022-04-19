package com.proyectoDBAdrian.code.repository;

import com.proyectoDBAdrian.code.model.Bitacora;
import com.proyectoDBAdrian.code.model.BitacoraPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BitacoraRepository extends JpaRepository<Bitacora, BitacoraPK> {
}
