package org.example;

import org.example.controllers.MovieController;
import org.example.entities.Movie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    //los métodos se llaman de MovieController

        //primeramente vamos a crear una estancia del controlador
        MovieController movieController = new MovieController();

        //segundo creamos los objetos si es necesario (debe de estar hechas la entidad)
        LocalDateTime.of(1990,2,1,0,0,0);

        Movie nuevaPelicula = new Movie(null, "Nueva Pelicula", 6.5, 7, LocalDateTime.of(1990,2,1,0,0,0), 220, 4 );

        /*
        //usamos un método del cotrolador instanciado
        movieController.create(nuevaPelicula);
        */


        //buscar película
        //Integer idBuscado = 6;


        //Movie peliculaEncontrada = movieController.findOne(idBuscado);

        //System.out.println(peliculaEncontrada);

        //buscar todas las películas

        List<Movie> peliculas = movieController.listar();

        for(Movie pelicula : peliculas){
            System.out.println(pelicula);

        }


        //actualizar pelicula 6

        //primero hay que buscarlo (método anterior)
        //Movie peliculaEncontrada = movieController.findOne(idBuscado);

        //setteamos el objeto
        //peliculaEncontrada.setTitle("Volver al futuro");
        //movieController.update(peliculaEncontrada);




        //eliminar un registro
        //int eliminar = 6;

        //movieController.delete(eliminar);




    }
}