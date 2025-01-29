package ejercicio_N2;

import java.util.Scanner;

public class EstructurasRepetitivas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precionItroducido = 0;
        boolean continuar = true;
        String respuesta;
        double precioFinal = 0;

        do {
            System.out.println("introduzca un artículo");
            precionItroducido = scanner.nextDouble();
            scanner.nextLine();

            precioFinal += precionItroducido;

            System.out.println("Desea continuar? :  si/no");

            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }

        } while (continuar);

        System.out.println("El precio final es: " + precioFinal);
    }
}
