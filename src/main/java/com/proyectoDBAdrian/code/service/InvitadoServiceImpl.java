package com.proyectoDBAdrian.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoDBAdrian.code.model.Invitado;
import com.proyectoDBAdrian.code.repository.InvitadoRepository;

@Service
public class InvitadoServiceImpl implements InvitadoService {
	
	@Autowired   //anotacion cuando voy a instanciar un objeto
	private InvitadoRepository invitadoRepository;

	@Override  // para utilizar un metodo de la interfaz donde ya existe, es para sobreescribirlo
	public List<Invitado> obtenerListaInvitados() {
		return invitadoRepository.findAll();
	}
	
}
