package com.ejemplo.holamundo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiConfiguracion {

    @Bean
    public String mensajePersonalizado() {
        return "¡Este es un mensaje de un bean!";
    }
}
