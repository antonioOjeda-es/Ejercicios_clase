package com.antonio.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//para linux @Table(name = "persona")

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

  @ManyToMany(fetch = FetchType.EAGER)
          @JoinTable(name= "persona_producto",
                  joinColumns = @JoinColumn (name = "persona_id"),
                  inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private Set<Producto> productos = new HashSet<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Tarjeta> tarjetas;

    //constructores

    public Persona(){};

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Set<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }


    //toString


    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", productos=" + productos +
                ", tarjetas=" + tarjetas +
                '}';
    }
}
