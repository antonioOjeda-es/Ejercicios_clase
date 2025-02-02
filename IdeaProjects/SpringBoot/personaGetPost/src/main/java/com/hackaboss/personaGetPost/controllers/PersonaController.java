package com.hackaboss.personaGetPost.controllers;


import com.hackaboss.personaGetPost.entities.Persona;
import com.hackaboss.personaGetPost.responses.RespuestaPersona;
import com.hackaboss.personaGetPost.utilities.UtilsPersona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {


    UtilsPersona utilsPersona = new UtilsPersona();


    @GetMapping("/")
    public List<Persona> listarPersnas(){

        return utilsPersona.getAllPersonas();

    }

    @GetMapping("/nuevo/")
    public Persona crearPersona(@RequestParam String nombre, @RequestParam int edad){

        Persona persona = new UtilsPersona().newPersona(nombre, edad);

        return persona;
    }

    @GetMapping("/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){

        return  utilsPersona.findOne(id);
    }

    @PostMapping("/")
    public RespuestaPersona guardarPersonaPost(@RequestBody Persona persona){

        return utilsPersona.createPersona(persona);
    }

    @PostMapping("/new/")
    public ResponseEntity guardarPersonaPostResponseEntity(@RequestBody Persona persona){

        return utilsPersona.createResponseEntity(persona);
    }

}
