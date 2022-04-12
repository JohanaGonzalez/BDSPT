package com.proyectoDBAdrian.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoDBAdrian.code.model.Invitado;

@Repository
public interface InvitadoRepository extends JpaRepository<Invitado, Integer> {

}
