package com.hackaboss.holaMundo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data                   // Genera getters, setters, toString, equals y hashCode
//@AllArgsConstructor     // Genera un constructor con todos los campos
//@NoArgsConstructor
public class Usuario {

    private Long id;
    private String name;
    private String surname;

    public Usuario() {
    }

    public Usuario(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
