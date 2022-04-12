package com.proyectoDBAdrian.code.service;

import com.proyectoDBAdrian.code.model.Lugar;
import com.proyectoDBAdrian.code.repository.LugarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LugarServiceImpl implements LugarService{

    private final LugarRepository lugarRepository;

    public LugarServiceImpl(LugarRepository lugarRepository) {
        this.lugarRepository = lugarRepository;
    }


    @Override
    public List<Lugar> obtenerListaLugares() {
        return lugarRepository.findAll();
    }

    @Override
    public Lugar obtenerunLugar(String nombre) {
        return lugarRepository.findByNombre(nombre);
    }
}
