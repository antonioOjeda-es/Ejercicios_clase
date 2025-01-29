package com.antonio.controllers;

import com.antonio.entities.Persona;
import com.antonio.persistence.GenericJPA;
import org.hibernate.annotations.Generated;

import java.util.List;

public class PersonaController {

    private final GenericJPA<Persona, Long> personaJPA;

    public PersonaController() {
        this.personaJPA = new GenericJPA<>(Persona.class);
    }

    public void create(String nombre, String apellido) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);

        personaJPA.createGenerico(persona);
    }

    public List<Persona> listarTodas() {
        return personaJPA.findAllGenerico();

    }

}
