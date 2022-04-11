package com.proyectoDBAdrian.code.service;

import java.util.List;

import com.proyectoDBAdrian.code.model.Artefacto;

public interface ArtefactoService {
	List<Artefacto> obtenerListaArtefactos();
	Artefacto obtenerUnArtefacto(String nombre);
}
