package com.proyectoDBAdrian.code.model;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Bitacora {
    // @GeneratedValue(strategy=GenerationType.AUTO) //que sea consecutivo automatico
    @EmbeddedId
    private BitacoraPK id;
    private int hora;

    public BitacoraPK getId() {
        return id;
    }

    public void setId(BitacoraPK id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
