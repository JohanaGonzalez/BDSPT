package com.proyectoDBAdrian.code.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lugar {
    @Id
    private Integer id;
    private String nombre;

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
}

