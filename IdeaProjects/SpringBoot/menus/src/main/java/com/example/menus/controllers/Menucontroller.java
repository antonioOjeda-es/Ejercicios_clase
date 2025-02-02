package com.example.menus.controllers;

import com.example.menus.Responses.RespuestaMenu;
import com.example.menus.entities.Menu;
import com.example.menus.utils.MenuUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class Menucontroller {

    MenuUtils menuUtils = new MenuUtils();

    //importante required = fal si queremos que el método prosiga sin que de error
    @GetMapping("")
    public List<Menu> listarTodoMenuFiltrado(@RequestParam(required = false) String tipoMenu){

        if(tipoMenu == null || tipoMenu.isEmpty()){
            return menuUtils.listarTodos();
        }
        return menuUtils.listarTodosFiltrado(tipoMenu);
    }

    @PostMapping("/agregarPlato/")
    public RespuestaMenu agregarPlato(@RequestBody Menu menu){

        //System.out.println("Entrando en insertar plato " + menu.getPlatos().get(0));
        return menuUtils.agregarPlato(menu);
    }
}
