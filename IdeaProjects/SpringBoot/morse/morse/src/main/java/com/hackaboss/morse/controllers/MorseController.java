package com.hackaboss.morse.controllers;

import com.hackaboss.morse.entities.CaracteresMorse;
import com.hackaboss.morse.utilities.PasarNumeroAString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/pasarMorse/{palabra}")

    public String pasarAMorse(@PathVariable String palabra) {


        //pasar a morse
        String morse = "";

        //agregar cada letra o palabra a la cadena morse
        for (int i = 0; i < palabra.length(); i++) {

            char c = palabra.charAt(i);
            String letra = String.valueOf(c);

            if( c >= '0' && c <= '9'){
                letra = PasarNumeroAString.pasarNumeroAchar(c);
            }

            morse += new CaracteresMorse(letra).getMorse() + " "; //agrego espacio para separar cada letra
        }

        System.out.println(palabra);

        return morse;
    }
}
