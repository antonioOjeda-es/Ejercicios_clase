package com.hackaboss.holaMundo.controllers;


import com.hackaboss.holaMundo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RootControllers {

    @GetMapping(path = "/")
    public String bienvenida(){
        return "Mensaje de Bienvenida";
    }

    @GetMapping(path = "/saludo")//endpoint de saludo
    public String Saludo(){

        List<String> listamandar = List.of("hol", "como estás", "Estoy de prueba");

        return listamandar.toString();
    }

    @GetMapping(path = "/usuario")
    public Usuario retornarUsuario(){

        Usuario usuariomandar =  new Usuario(6L, "Pepe", "Utrera");
        return usuariomandar;
    }

    @GetMapping(path = "/listaUsuario")
    public List<Usuario> listarUsuarios(){

        return List.of(
                new Usuario(1L, "Antonio", "García"),
                new Usuario(2L, "María", "López"),
                new Usuario(3L, "Juan", "Martínez"),
                new Usuario(4L, "Ana", "Rodríguez"),
                new Usuario(5L, "Carlos", "Sánchez")
        );
    }
}
