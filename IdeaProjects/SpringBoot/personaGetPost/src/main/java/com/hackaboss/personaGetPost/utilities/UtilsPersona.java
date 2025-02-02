package com.hackaboss.personaGetPost.utilities;

import com.hackaboss.personaGetPost.entities.Persona;
import com.hackaboss.personaGetPost.responses.RespuestaPersona;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class UtilsPersona {

    private List<Persona> personas;

    public UtilsPersona() {
        this.personas = new ArrayList<>();

        personas.add(new Persona(1L, "Juan Pérez", 30));
        personas.add(new Persona(2L, "Antonio Ojeda", 30));
        personas.add(new Persona(3L, "Pedro Ramírez", 30));
        personas.add(new Persona(4L, "Marcos Peralta", 30));
        personas.add(new Persona(5L, "Jose Baena", 30));

    }

    public List<Persona> getAllPersonas() {
        return personas;
    }

    public Persona newPersona(String nombre, int edad){

        this.personas.add(new Persona(this.personas.size()+1L, nombre, edad));
        //para cargar el último
        return this.personas.get(this.personas.size()-1);
    }

    public Persona findOne(Long id){
        return this.personas.stream()
               .filter(persona -> persona.getId() == id)
               .findFirst()
                .get();
    }

    public RespuestaPersona createPersona(Persona persona){

        try {
            this.personas.add(persona);

            return new RespuestaPersona("Persona creada correctamente", 200, "POST");
        }catch (Exception e){
            return new RespuestaPersona("Error al crear la persona", 500, "POST");
        }

    }

    //forma utilizando el objeto de respuesta
    public ResponseEntity createResponseEntity(Persona persona){

        HttpHeaders headers = new HttpHeaders();
        headers.add("clavePrioritaria", "valorprioritario");

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(persona);
    }
}
