package com.jackaboss.ejercicioEventosAcademicos.Controllers;


import com.jackaboss.ejercicioEventosAcademicos.Responses.ResponseEventos;
import com.jackaboss.ejercicioEventosAcademicos.entities.EventosAcademicos;
import com.jackaboss.ejercicioEventosAcademicos.utils.EventosUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/eventos")
public class EventosController {

    EventosUtils listaEventos = new EventosUtils();

    @GetMapping("/eventos")
    public List<EventosAcademicos> listarEventos(){

        return listaEventos.listarTodos();
    }

    @GetMapping("/eventos/{id}")
    public ResponseEventos encontrarEvento(@PathVariable("id") Long idEvento){

        return listaEventos.encontrarEvento(idEvento);
    }

    @PostMapping("/evento")
    public ResponseEventos agregarEvento(@RequestBody EventosAcademicos eventosAcademicos){

        return listaEventos.agregarEvento(eventosAcademicos);
    }
}
