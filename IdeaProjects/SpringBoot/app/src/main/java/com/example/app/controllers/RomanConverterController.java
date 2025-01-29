package com.example.app.controllers;

import com.example.app.utilities.PasarNumeros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanConverterController {

    @GetMapping("/convertir/{numeroDecimal}")
    public String convertirARoman(@PathVariable  int numeroDecimal) {
        String numeroConvertido = PasarNumeros.pasarANumeroRomano(numeroDecimal);

        System.out.println(numeroConvertido);
        return numeroConvertido;
    }

}
