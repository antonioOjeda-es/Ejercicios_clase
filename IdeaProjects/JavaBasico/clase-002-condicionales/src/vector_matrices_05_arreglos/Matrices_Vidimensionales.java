package vector_matrices_05_arreglos;

import java.util.Scanner;

public class Matrices_Vidimensionales {

    public static void main(String[] args) {
        //declaración e inicialialización de matriz de edades
        int [][] edades = new int [4][4];

        Scanner scanner = new Scanner(System.in);

        //introducimos los datos:
        System.out.println("Ingrese las edades para la matriz de 4x4");

        for(int fila = 0; fila < edades.length; fila++) {

            for (int columna = 0; columna < edades[fila].length; columna++){
                System.out.println("Ingresa la edad de la fina: " + fila + ", columna: " + columna);
                edades[fila][columna] = scanner.nextInt();
            }
        }

        //imprimimos los valores
        for(int fila = 0; fila < edades.length; fila++) {

            for (int columna = 0; columna < edades[fila].length; columna++){
                System.out.println("fila: " + fila + ", con el número de columna " + columna + " es " + edades[fila][columna]);
            }
        }
     }
}
