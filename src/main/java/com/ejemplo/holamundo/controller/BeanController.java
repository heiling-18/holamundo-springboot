package com.ejemplo.holamundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class BeanController {

    private final String mensajePersonalizado;

    @Autowired
    public BeanController(String mensajePersonalizado) {
        this.mensajePersonalizado = mensajePersonalizado;
    }

    @GetMapping
    public String obtenerBean() {
        return mensajePersonalizado;
    }
}
