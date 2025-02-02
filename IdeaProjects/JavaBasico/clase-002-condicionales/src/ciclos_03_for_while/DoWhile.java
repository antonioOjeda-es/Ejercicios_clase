package ciclos_03_for_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un número mayor a 0");
             numero = scanner.nextInt();
        }while (numero >= 0);

        System.out.println("Has ingresado un número negativo: " + numero);
    }
}
