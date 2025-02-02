package com.example.menus.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private List<Menu> menus;
    private List<String> platos;

    public Pedido() {
        this.menus = new ArrayList<>();
        this.platos = new ArrayList<>();

    }

    public Pedido(Long id) {
        this.menus = new ArrayList<>();
        this.platos = new ArrayList<>();
        this.id = id;
    }
    //para agregar pedido
    public Pedido(List<Menu> menus, List<String> platos) {
        this.menus = menus; //menus != null? menus : new ArrayList<>();
        this.platos = platos; //platos != null? platos : new ArrayList<>();
    }

    public Pedido(Long id, List<Menu> menus, List<String> platos) {
        this.id = id;
        this.menus = menus; //menus != null? menus : new ArrayList<>();
        this.platos = platos != null? platos : new ArrayList<>();
    }

    //getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<String> getPlatos() {
        return platos;
    }

    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    //métodos propios
    public void addPlato(String plato){
        this.platos.add(plato);
    }

    public void addMenu(Menu menu){
        this.menus.add(menu);
    }

    //toString

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", menus=" + menus +
                ", platos=" + platos +
                '}';
    }
}
