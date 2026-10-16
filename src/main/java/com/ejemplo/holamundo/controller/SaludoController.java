package com.ejemplo.holamundo.controller;

import com.ejemplo.holamundo.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    private final MiServicio miServicio;

    @Autowired
    public SaludoController(MiServicio miServicio) {
        this.miServicio = miServicio;
    }

    @GetMapping
    public String mostrarSaludo() {
        return miServicio.obtenerSaludo();
    }
}
