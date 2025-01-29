package com.hackaboss.refranes.Controller;


import com.hackaboss.refranes.utils.NumberRandom;
import entities.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RefranesController {

    @GetMapping("/")
    public Refran lanzarRefran(){

         List<Refran> listaRefranes = List.of(
                new Refran(1, "A quien madruga, Dios le ayuda"),
                new Refran(2, "No por mucho madrugar amanece más temprano"),
                new Refran(3, "Más vale pájaro en mano que ciento volando"),
                new Refran(4, "A caballo regalado no le mires el dentado"),
                new Refran(5, "El que mucho abarca, poco aprieta"),
                new Refran(6, "Quien a buen árbol se arrima, buena sombra le cobija"),
                new Refran(7, "En boca cerrada no entran moscas"),
                new Refran(8, "No hay mal que por bien no venga"),
                new Refran(9, "Agua pasada no mueve molino"),
                new Refran(10, "Al mal tiempo, buena cara")
        );
         return listaRefranes.get(NumberRandom.crearRandom(listaRefranes.size()));
    }
}
