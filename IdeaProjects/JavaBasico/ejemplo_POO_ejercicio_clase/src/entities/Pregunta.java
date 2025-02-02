package entities;

import java.util.List;

public class Pregunta {

    //Declaración de variables
    private int numeroPregunta;
    private String pregunta;
    private int respuestaAcertada;

    //Constructores
    public Pregunta() {
    }

    public Pregunta(int numeroPregunta, String pregunta, int respuestaAcertada) {
        this.numeroPregunta = numeroPregunta;
        this.pregunta = pregunta;
        this.respuestaAcertada = respuestaAcertada;
    }

    //Getters y Setters
    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    public void setNumeroPregunta(int numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getRespuestaAcertada() {
        return respuestaAcertada;
    }

    public void setRespuesta(int respuesta) {
        this.respuestaAcertada = respuesta;
    }

    //Modificar to String
    @Override
    public String toString() {
        return "Pregunta{" +
                "numeroPregunta=" + numeroPregunta +
                ", pregunta='" + pregunta + '\'' +
                ", respuestaAcertada='" + respuestaAcertada + '\'' +
                '}';
    }


    //métodos
    public String comprovarRespuesta (int respuesta){
        if(respuesta == this.respuestaAcertada){
            return "Has acertado la pregunta";
        }else{
            return "La respuesta no es válida";
        }
    }

    public String hacerExamen(int[] respuestas, List<Pregunta> preguntas){
        //hago un contador de aciertos
        int aciertos = 0;
        //itero las respuesta para compararlos con las preguntas
        for (int i = 0; i < respuestas.length; i++){

            if(respuestas[i] == preguntas.get(i).getRespuestaAcertada()){
                aciertos ++;
            }
        }
        return "Has acertado " + aciertos + " preguntas";
    }
}
