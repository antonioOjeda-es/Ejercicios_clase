package com.jackaboss.ejercicioEventosAcademicos.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventosAcademicos {
    Long id;
    String titulo;
    String descripcion;
    LocalDate fecha;
    LocalTime hora;
    String lugar;
    String ponente;

    public EventosAcademicos() {
    }

    public EventosAcademicos(Long id, String titulo, String descripcion, LocalDate fecha, LocalTime hora, String lugar, String ponente) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

    public EventosAcademicos(String titulo, String descripcion, LocalDate fecha, LocalTime hora, String lugar, String ponente) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    @Override
    public String toString() {
        return "EventosAcademicos{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", ponenete='" + ponente + '\'' +
                '}';
    }
}
