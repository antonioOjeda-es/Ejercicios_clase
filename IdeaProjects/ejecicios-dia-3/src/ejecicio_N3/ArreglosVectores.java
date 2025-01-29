package ejecicio_N3;

import java.util.Scanner;

public class ArreglosVectores {
    public static void main(String[] args) {

        int [] temperaturas = new int[7];
        Scanner scanner = new Scanner(System.in);
        int sumatoria = 0;

        System.out.println("Introduce las temperaturas maxima de las últimas semanas");

        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("introduzca temperatura de la semana " + (i+1));
            temperaturas[i] = scanner.nextInt();

            sumatoria += temperaturas[i];
        }
        System.out.println("La temperatura media es:" + (sumatoria / temperaturas.length));
        scanner.close();
    }
}
