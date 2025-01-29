package ejercicio1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        //creo las variables
        String nombre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, bienvenido al sistema");

        System.out.println("Cual es su nombre?");

        nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + " bienvenido al sistema");

        //cerramos conexión
        scanner.close();

    }
}
