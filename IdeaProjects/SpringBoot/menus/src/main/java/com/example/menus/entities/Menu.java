package com.example.menus.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Long id;
    private String tipoMenu;
    private List<String> platos;
    private String estado;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public Menu(Long id, String tipoMenu, List<String> platos, String estado) {
        this.id = id;
        this.tipoMenu = tipoMenu;
        this.platos = platos != null ? platos : new ArrayList<>();
        this.estado = estado;
    }
    //constructor con id y plato para agregar
    public Menu(Long id, List<String> platos) {
        this.id = id;
        this.platos = platos != null ? platos : new ArrayList<>();
    }

    public Menu(Long id, String tipoMenu) {
        this.id = id;
        this.tipoMenu = tipoMenu;
        this.platos = new ArrayList<>();
    }

//getters setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public List<String> getPlatos() {
        return platos;
    }

    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void addPlato(String plato) {
        if (plato != null && !plato.isEmpty()) {
            platos.add(plato);
        } else {
            throw new IllegalArgumentException("El plato no puede ser nulo o vacío");
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", tipoMenu='" + tipoMenu + '\'' +
                ", platos=" + platos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
