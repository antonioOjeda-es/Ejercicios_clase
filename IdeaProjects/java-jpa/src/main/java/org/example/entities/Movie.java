package org.example.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

//para decir que va a ser una tabla y el nombre de la tabla; para decirselo a jpa
@Entity(name = "movies")
public class Movie {
    //para mapear en la base de datos las columnas

    //para decir que es la pk de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para decir que es autoincrementable
    private Integer id;

    //nombre del campo de la tabla, que no sea nulo, número máximo de carácteres
    @Column(name = "title" ,nullable = false, length = 255)
    private String title;

    @Column(name = "rating")
    private double rating;

    @Column()
    private Integer awards;

    @Column()
    private LocalDateTime release_date;

    @Column()
    private Integer length;

    @Column(name = "genre_id")
    private Integer genreId;

    //constructores
    public Movie(){};

    public Movie(Integer id, String title, double rating, Integer awards, LocalDateTime release_date, Integer length, Integer genreId) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.release_date = release_date;
        this.length = length;
        this.genreId = genreId;
    }

    //Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    //toString
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", awards=" + awards +
                ", release_date=" + release_date +
                ", length=" + length +
                ", genreId=" + genreId +
                '}';
    }
}
