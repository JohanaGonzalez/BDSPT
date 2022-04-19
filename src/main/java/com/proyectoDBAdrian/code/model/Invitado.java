package com.proyectoDBAdrian.code.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="invitados")
public class Invitado {
	@Id
	private Integer id;
	private String nombre;
	private int estatura;

	/*@OneToMany
	private List<BitacoraPK> bitacora;*/
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	/*public boolean addBitacora(BitacoraPK bitacoraPK) {
		if(bitacora == null) {
			bitacora = new ArrayList<>();
		}
		return this.bitacora.add(bitacoraPK);
	}*/
}
