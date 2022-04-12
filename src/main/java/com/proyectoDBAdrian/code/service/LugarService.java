package com.proyectoDBAdrian.code.service;

import com.proyectoDBAdrian.code.model.Lugar;

import java.util.List;

public interface LugarService {
    List<Lugar> obtenerListaLugares();
    Lugar obtenerunLugar(String nombre);
}