package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        //creo un objeto para entrada por consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, introduzca base:");

        //pregunto por la base
        double base = scanner.nextDouble();

        System.out.println("Ahora introduzca la altura:");

        //preugnto por la altura
        double altura = scanner.nextDouble();

        double area = base * altura / 2 ;

        //cierro la conexión
        scanner.close();

        System.out.println("El área del triangulo es: " + area);
    }
}
