package ejercicio_N1;

import java.util.Scanner;

public class EstructurasCondicionales {
    public static void main(String[] args) {

        //declaro las variables
        Scanner scanner = new Scanner(System.in);
        int edad;
        boolean repetir = true;

        //uso do/while para inidicar que voy a iniciar la pregunta al menos una vez
        do {
            System.out.println("Vamos a valorar si su edad sirve para entrar al recital");
            System.out.println("Que edad tiene usted?");

            //utilizo try/catch para controlar que el tipo de dato sea un número entero
            try{
                edad = scanner.nextInt();

                //valoramos si la edad es coherente
                if(edad > 0 && edad < 100){

                    //valoramos si la edad es mayor de 18
                    if (edad > 18){
                        System.out.println("Puede usted entrar al recital");
                        repetir = false;
                    }else{
                        System.out.println("Usted no puede entrar al recital hasta que tenga más de 18 años");
                        repetir = false;
                    }

                }else{
                    System.out.println("La edad introducida no es válida");
                }

            } catch (Exception e) {
                System.out.println("No ha introducido un número válido para la edad");
                //Limpio buffer para que no se quede la línea y se quede en bucle la siguiente pregunta
                scanner.nextLine();
            }

        }while(repetir);
        //cierro conexión
        scanner.close();
    }
}
