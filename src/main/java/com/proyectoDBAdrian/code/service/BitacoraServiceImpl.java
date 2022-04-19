package com.proyectoDBAdrian.code.service;

import com.proyectoDBAdrian.code.model.Bitacora;
import com.proyectoDBAdrian.code.repository.BitacoraRepository;
import com.proyectoDBAdrian.code.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BitacoraServiceImpl implements BitacoraService{

    @Autowired
    private BitacoraRepository bitacoraRepository;

    @Override
    public List<Bitacora> obtenerListaBitacoras() {
            return bitacoraRepository.findAll();
    }
}
