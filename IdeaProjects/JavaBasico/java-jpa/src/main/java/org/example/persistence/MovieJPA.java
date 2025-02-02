package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieJPA {
    public void create(Movie nuevaPelicula) {


        EntityManager em = ConfigJPA.getEntityManager();

        try{
            //intentar de hacer algo peligroso

            //usamos transaction porque vamos a modificar la tabla, sino con la línea central es suficiente
            em.getTransaction().begin(); //iniciamos una transacción (por si algo sale mal o bien)
            em.persist(nuevaPelicula);//guardar objeto (este es el método principal que permite guardar)
            em.getTransaction().commit();//guardamos si todo sale bien

        }finally {
            //si sale todo bien
            em.close();
        }
    }

    public Movie findOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            //intentar de hacer algo peligroso

            return em.find(Movie.class, idBuscado);//buscar (Clase.class,

        }finally {
            //si sale todo bien
            em.close();
        }

    }

    public List<Movie> listar() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            //intentar de hacer algo peligroso

            //creamos esta query personalizada utilizando estos parámetros para que me devuelva el objeto
            TypedQuery<Movie>  query = em.createQuery("SELECT p FROM movies p", Movie.class);

            return query.getResultList();

        }finally {
            //si sale todo bien
            em.close();
        }

    }

    public void update(Movie peliculaEncontrada) {

        EntityManager em = ConfigJPA.getEntityManager();
        try{
            //intentar de hacer algo peligroso

            //usamos transaction porque vamos a modificar la tabla
            em.getTransaction().begin(); //iniciamos una transacción (por si algo sale mal o bien)
            em.merge(peliculaEncontrada);//merge para actualizar
            em.getTransaction().commit();//guardamos si todo sale bien


        }finally {
            //si sale todo bien
            em.close();
        }
    }

    public void delete(int eliminar) {

        EntityManager em = ConfigJPA.getEntityManager();
        try{
            //intentar de hacer algo peligroso

            //usamos transaction porque vamos a modificar la tabla
            em.getTransaction().begin(); //iniciamos una transacción (por si algo sale mal o bien)

            //hay que buscar el objeto para usar el método remove
            Movie peliculaEncontrada = em.find(Movie.class, eliminar);

            //hay que ver si no es nulo para poder eliminar y que no de error
            if(peliculaEncontrada != null){
                em.remove(peliculaEncontrada);//merge para actualizar

            }
            em.getTransaction().commit();//guardamos si todo sale bien


        }finally {
            //si sale todo bien
            em.close();
        }
    }
    //se realizan las operaciones crud

    //tiene que hacer referencia a la entidad Movie
}
