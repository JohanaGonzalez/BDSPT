package com.proyectoDBAdrian.code.controller;

import com.proyectoDBAdrian.code.model.Bitacora;
import com.proyectoDBAdrian.code.service.BitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bitacora")
public class BitacoraController {

    @Autowired
    private BitacoraService service;

    @GetMapping
    public List<Bitacora> obtenerBitacoras(){
        System.out.println("Hola Bitacora");
        return service.obtenerListaBitacoras();
    }
}
