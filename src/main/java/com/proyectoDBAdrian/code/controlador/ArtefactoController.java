package com.proyectoDBAdrian.code.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoDBAdrian.code.model.Artefacto;
import com.proyectoDBAdrian.code.service.ArtefactoService;

@RestController
@RequestMapping("artefacto")
public class ArtefactoController {

	private final ArtefactoService artefactoService;
	
	public ArtefactoController(ArtefactoService artefactoService) {
		this.artefactoService = artefactoService;
	}

	@GetMapping("/artefactos")
	public List<Artefacto> obtenerArtefactos(){
		return artefactoService.obtenerListaArtefactos();
	}
	
	@GetMapping(path = "/{nombre}")
	public Artefacto obtenerUnArtefacto(@PathVariable("nombre") String nombre) {
		return artefactoService.obtenerUnArtefacto(nombre);
	}
	
}
