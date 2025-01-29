package com.antonio.entities;

import jakarta.persistence.*;

@Entity
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //creamos una enumeración para que solo coga esos datos
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTarjeta tipo;


    public enum TipoTarjeta{
        DEBITO,
        CREDITO
    }

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    public Tarjeta(){};

    public Tarjeta(Long id, TipoTarjeta tipo, Persona persona) {
        this.id = id;
        this.tipo = tipo;
        this.persona = persona;
    }

    public Tarjeta(TipoTarjeta tipo, Persona persona) {
        this.tipo = tipo;
        this.persona = persona;
    }

    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTarjeta getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarjeta tipo) {
        this.tipo = tipo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    //toString

    @Override
    public String toString() {
        return "Tarjeta{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", persona=" + persona +
                '}';
    }
}
