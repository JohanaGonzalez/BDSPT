package com.proyectoDBAdrian.code.model;

import javax.persistence.*;

@Entity
@Table(name="Artefactos")
public class Artefacto {
	@Id
	private Integer id;
	private String nombre;
	private Integer medida;

	@ManyToOne
	private Lugar lugar;

	public Integer getId() {
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
	public Integer getMedida() {
		return medida;
	}
	public void setMedida(Integer medida) {
		this.medida = medida;
	}
	public Lugar getLugar() {
		return lugar;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}
}
