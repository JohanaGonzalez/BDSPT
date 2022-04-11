package com.proyectoDBAdrian.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectoDBAdrian.code.repository.InvitadoRepository;

@SpringBootApplication
public class ProyectoDbAdrianApplication {
	
	@Autowired
	private static InvitadoRepository invitadoRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoDbAdrianApplication.class, args);
		invitadoRepository.findAll();
	}

}
