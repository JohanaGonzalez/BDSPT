package com.proyectoDBAdrian.code.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoDBAdrian.code.model.Invitado;
import com.proyectoDBAdrian.code.service.InvitadoService;

@RestController
@RequestMapping("invitado")
public class InvitadoController {
	
	@Autowired
	private InvitadoService service;
	
	@GetMapping
	public List<Invitado>  obtenerInvitados(){
		System.out.println("Hola Johana");
		return service.obtenerListaInvitados();
	}
}
