package com.hackaboss.datosCuriosos.Controllers;


import com.hackaboss.datosCuriosos.entities.DatoCurioso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class DatoController {

    @GetMapping("/")
    public DatoCurioso entregarDatoCurioso(){
        List<DatoCurioso> datosCuriosos = List.of(
                new DatoCurioso(1, "Los pulpos tienen tres corazones."),
                new DatoCurioso(2, "Las abejas pueden reconocer rostros humanos."),
                new DatoCurioso(3, "El corazón de un camarón está en su cabeza."),
                new DatoCurioso(4, "Los flamencos son rosados debido a su dieta."),
                new DatoCurioso(5, "Los koalas duermen hasta 22 horas al día."),
                new DatoCurioso(6, "Las ballenas jorobadas pueden cantar durante horas."),
                new DatoCurioso(7, "Los canguros no pueden caminar hacia atrás."),
                new DatoCurioso(8, "Las mariposas tienen sensores de sabor en sus patas."),
                new DatoCurioso(9, "Los gatos tienen más huesos que los humanos."),
                new DatoCurioso(10, "Las estrellas de mar pueden regenerar sus brazos.")
        );

        Random random = new Random();

        return datosCuriosos.get(random.nextInt(datosCuriosos.size()));
    }
}
