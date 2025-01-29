package claseScanner;

import java.io.IOException;
import java.util.Scanner;

public class LecturaScanner {

    public static void main(String[] args) {
        //instanciamos un scanner
        Scanner escanner = new Scanner(System.in);   //hay que decirle que va a entrar por entrada en consola (system.in)
        String nombreCompleto;

        System.out.println("Dame tu nombre completo");


        nombreCompleto = escanner.nextLine();
        System.out.println("Hola, como estas " + nombreCompleto);

        System.out.println("Ahora dame tu edad");

        int edad = escanner.nextInt();

        System.out.println("tienes " + edad + " años");

        escanner.close();       //es optativo pero es aconsejable

        try {

        }catch (Exception e){

        }
    }
}
