import entities.Pregunta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //declaro las variables
        Pregunta metodosPregunta = new Pregunta();
        int [] respuestas = new int[3];

        //hago una lista de respuestas
        respuestas[0] = 1;
        respuestas[1] = 4;
        respuestas[2] = 2;

        //creo unas preguntas
        Pregunta pregunta1 = new Pregunta(1,"¿cuales son los puntos cardinales?", 1);
        Pregunta pregunta2 = new Pregunta(2, "¿Cuál es el valos del número pi", 3);
        Pregunta pregunta3 = new Pregunta(3, "¿En que comunidad autónoma se encuentra la provincia de málaga?", 2);

        //hago una lista de preguntas
        List <Pregunta> resultados = new ArrayList<>();
        resultados.add(pregunta1);
        resultados.add(pregunta2);
        resultados.add(pregunta3);

        //uso los métodos
        String corregirPregunta = pregunta2.comprovarRespuesta(3);
        System.out.println(corregirPregunta);

        String resultadoExamen = metodosPregunta.hacerExamen(respuestas, resultados);
        System.out.println(resultadoExamen);

    }
}