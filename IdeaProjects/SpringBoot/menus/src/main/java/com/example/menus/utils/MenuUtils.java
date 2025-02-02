package com.example.menus.utils;

import com.example.menus.Responses.RespuestaMenu;
import com.example.menus.entities.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuUtils {

    List<Menu> listaMenu = new ArrayList<>();

    public MenuUtils() {

        Menu menu1 = new Menu(
                1L,
                "Menú del día",
                new ArrayList<>(Arrays.asList("Ensalada mixta", "Paella", "Flan casero")),
                "En preparación"
        );

        // Menú 2: Menú vegetariano
        Menu menu2 = new Menu(
                2L,
                "Menú vegetariano",
                new ArrayList<>(Arrays.asList("Gazpacho", "Lasaña de verduras", "Fruta del tiempo")),
                "Servido"
        );

        // Menú 3: Menú degustación
        Menu menu3 = new Menu(
                3L,
                "Menú degustación",
                new ArrayList<>(Arrays.asList("Carpaccio de atún", "Risotto de setas", "Solomillo", "Tarta de chocolate")),
                "Servido"
        );

        // Menú 4: Menú infantil
        Menu menu4 = new Menu(
                4L,
                "Menú infantil",
                new ArrayList<>(Arrays.asList("Macarrones con tomate", "Nuggets de pollo", "Helado")),
                "En preparación"
        );

        // Menú 5: Menú ejecutivo
        Menu menu5 = new Menu(
                5L,
                "Menú ejecutivo",
                new ArrayList<>(Arrays.asList("Crema de calabaza", "Merluza en salsa verde", "Tiramisú")),
                "Servido"
        );
        this.listaMenu.add(menu1);
        this.listaMenu.add(menu2);
        this.listaMenu.add(menu3);
        this.listaMenu.add(menu4);
        this.listaMenu.add(menu5);
    }

    public List<Menu> listarTodos() {

        return listaMenu;
    }

    public List<Menu> listarTodosFiltrado(String tipoMenu) {
            //filtro la lista por tipo de menú
            return listaMenu.stream()
                    .filter(m -> m.getTipoMenu().equals(tipoMenu))
                    .toList();
    }


    public RespuestaMenu agregarPlato(Menu menu) {

        //uso try/catch para lanzar la clase respuestaMenu con un mensaje dependiendo de como saliera todo
        try {
            //busco el plato
            listaMenu.stream()
                    .filter(p -> p.getId().equals(menu.getId()))
                    .findFirst()
                    //agrego la lista de platos que me llega del menu
                    .ifPresent(p -> menu.getPlatos().forEach(plato -> p.addPlato(plato)));
            //si todo sale bien, devuelvo respuestaMenu con mensaje y estado 201 (Created)
            return new RespuestaMenu("Plato agregado correctamente al menú", 201, "POST");

        }catch (Exception e){
            return new RespuestaMenu("No se ha podido agregar el plato", 400, "POST");
        }
    }
}
