package com.proyectoDBAdrian.code.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class BitacoraPK implements Serializable {
    //@ManyToOne
    @JoinColumn (name = "invitado")
    private Integer invitado;

    //@ManyToOne
    @JoinColumn (name = "lugar")
    private Integer lugar;

    public Integer getInvitado() {
        return invitado;
    }

    public void setInvitado(Integer invitado) {
        this.invitado = invitado;
    }

    public Integer getLugar() {
        return lugar;
    }

    public void setLugar(Integer lugar) {
        this.lugar = lugar;
    }
}
