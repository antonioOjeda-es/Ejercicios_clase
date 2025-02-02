package com.jackaboss.conversorUnidades.controllers;

import com.jackaboss.conversorUnidades.utilities.ConversorUnidades;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/pasarCentimetros/{centimetros}")
    public String pasarCentimetros(@PathVariable("centimetros") Integer centimetros){
        return centimetros + " cm equivale a " + ConversorUnidades.convertirCentimetrosMetros(centimetros) + " m";
    }
}
