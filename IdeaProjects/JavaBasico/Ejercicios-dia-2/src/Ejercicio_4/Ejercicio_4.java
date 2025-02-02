package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        //creamos la variable scanner para almacenar números en las variables
        Scanner scanner = new Scanner(System.in);

        //pedimos el primer número para la variable numero1
        System.out.println("Hola, ingrese el primer número");
        double numero1 = scanner.nextDouble();

        //pedimos el primer número para la variable numero2
        System.out.println("Hola, ingrese el segundo número");
        double numero2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("El resultado de su suma es: " + (numero1 + numero2));
        System.out.println("El resultado de su resta es: " + (numero1 - numero2));
        System.out.println("El resultado de su multiplicación es: " + numero1 * numero2);

        //uso try/catch para capturar el error al ser el divisor 0 y mande un mensaje a consola
        try {
            //lanzo la excepción
            if(numero2 == 0){
                throw new ArithmeticException();
            }
            double resultado = numero1 / numero2;
            System.out.println("El resultado de su división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
        //cierro la conexión
        scanner.close();
    }
}
