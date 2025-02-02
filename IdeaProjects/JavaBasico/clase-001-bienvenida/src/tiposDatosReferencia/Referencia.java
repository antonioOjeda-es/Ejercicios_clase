package tiposDatosReferencia;

import tiposDatosReferencia.Persona.Persona;

public class Referencia {

    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Pérez";
        int edad = 38;

        System.out.println("mi nombre es: " + nombre);

        System.out.println("longitud de la cadena: " + nombre.length());

        //creo una variable de tipo persona y la creo
        Persona persona = new Persona(nombre, edad);

        System.out.println("El nombre es: " + persona.getNombre());
        System.out.println("El edad es: " + persona.getEdad());
    }
}
