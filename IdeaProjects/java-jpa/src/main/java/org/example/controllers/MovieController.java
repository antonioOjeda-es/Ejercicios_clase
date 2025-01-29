package org.example.controllers;

import org.example.entities.Movie;
import org.example.persistence.MovieJPA;

import java.util.ArrayList;
import java.util.List;

public class MovieController {

    //métodos para realizar las operaciones crud sobre la entidad MovieJPA

    //usará los métodos de Movie.jpa

    MovieJPA movieJPA = new MovieJPA();

    public void create(Movie nuevaPelicula) {
            movieJPA.create(nuevaPelicula);
    }


    public Movie findOne(Integer idBuscado) {
             return movieJPA.findOne(idBuscado);
    }

    public List<Movie> listar() {
        return movieJPA.listar();
    }

    public void update(Movie peliculaEncontrada) {
        movieJPA.update(peliculaEncontrada);
    }

    public void delete(int eliminar) {
        movieJPA.delete(eliminar);
    }
}
