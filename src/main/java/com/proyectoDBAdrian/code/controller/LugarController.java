package com.proyectoDBAdrian.code.controller;

import com.proyectoDBAdrian.code.model.Lugar;
import com.proyectoDBAdrian.code.service.LugarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lugar")
public class LugarController {
 private final LugarService lugarService;

    public LugarController(LugarService lugarService) {
        this.lugarService = lugarService;
    }
    @GetMapping("/lugares")
    public List<Lugar> obtenerLugares(){
        return lugarService.obtenerListaLugares();
    }
    @GetMapping(path = "/{nombre}")
    public Lugar obtenerUnLugar(@PathVariable("nombre") String nombre) {
        return lugarService.obtenerunLugar(nombre);
    }
}
