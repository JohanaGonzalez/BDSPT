package com.proyectoDBAdrian.code.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectoDBAdrian.code.model.Artefacto;
import com.proyectoDBAdrian.code.repository.ArtefactoRepository;

@Service
public class ArtefactoServiceImpl implements ArtefactoService{
	
	private final ArtefactoRepository artefactoRepository;

	public ArtefactoServiceImpl(ArtefactoRepository artefactoRepository) {
		this.artefactoRepository = artefactoRepository;
	}

	@Override
	public List<Artefacto> obtenerListaArtefactos() {
		return artefactoRepository.findAll();
	}

	@Override
	public Artefacto obtenerUnArtefacto(String nombre) {
		return artefactoRepository.findByNombre(nombre);
	}

}
