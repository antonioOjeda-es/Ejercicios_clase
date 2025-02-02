package com.jackaboss.ejercicioEventosAcademicos.utils;

import com.jackaboss.ejercicioEventosAcademicos.Responses.ResponseEventos;
import com.jackaboss.ejercicioEventosAcademicos.entities.EventosAcademicos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class EventosUtils {



    // Crear una lista para almacenar los eventos
    static List<EventosAcademicos> eventos = new ArrayList<>();

    public EventosUtils(){
        // Crear 5 eventos
        eventos.add(new EventosAcademicos(1L, "Conferencia","Conferencia sobre Inteligencia Artificial",LocalDate.of(2023, 3, 15), LocalTime.of(10, 0), "Auditorio Principal", "Dr. Juan Pérez"));
        eventos.add(new EventosAcademicos(2L, "Informática", "Taller de Programación en Java", LocalDate.of(2023, 4, 20), LocalTime.of(14, 30), "Sala de Computación 101", "Ing. María López"));
        eventos.add(new EventosAcademicos(3L, "Seminario", "Seminario de Innovación Educativa", LocalDate.of(2023, 5, 10), LocalTime.of(9, 0), "Sala de Conferencias", "Prof. Carlos García"));
        eventos.add(new EventosAcademicos(4L, "Charla", "Charla sobre Ciberseguridad", LocalDate.of(2023, 6, 5), LocalTime.of(16, 0), "Sala de Reuniones", "Lic. Ana Torres"));
        eventos.add(new EventosAcademicos(5L, "Acto", "Presentación de Proyectos de Fin de Carrera", LocalDate.of(2023, 7, 25), LocalTime.of(11, 0), "Auditorio Principal", "Comité Académico"));
    }


    public List<EventosAcademicos> listarTodos() {
        return eventos;
    }

    public ResponseEventos encontrarEvento(Long idEvento) {

        System.out.println(eventos);

        EventosAcademicos eventoEncontrado = eventos.stream()
                .filter(e -> e.getId().equals(idEvento))
                .findFirst()
                .orElse(null);


        if(eventoEncontrado != null){
            return new ResponseEventos("Evento encontrado", 400, "POST", eventoEncontrado);

        }

        return new ResponseEventos("No se ha podido encontrar el evento", 400, "POST");
    }

    public ResponseEventos agregarEvento(EventosAcademicos eventosAcademicos) {

        try {
            eventosAcademicos.setId(Long.valueOf(eventos.size() + 1));

            eventos.add(eventosAcademicos);

            return new ResponseEventos("Evento agregado", 400, "POST", eventosAcademicos);
        } catch (Exception e) {
            return new ResponseEventos("No se ha podido agregar el evento", 400, "POST");
        }
    }
}
