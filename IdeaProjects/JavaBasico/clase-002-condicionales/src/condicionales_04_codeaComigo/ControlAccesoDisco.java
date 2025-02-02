package condicionales_04_codeaComigo;

import java.util.Scanner;

public class ControlAccesoDisco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edadPersona;

        System.out.println("Que edad tiene usted?");

        do {
            edadPersona = scanner.nextInt();

            if(edadPersona < 1 || edadPersona > 100){
                System.out.println("Edad errónea, vuelva a introducir su edad");
            }

        }while (edadPersona < 1 || edadPersona > 100);

        //evaluo lo datos introducidos
        if(edadPersona > 18){
            System.out.println("Puede usted entrar en la fiesta");
        } else if(edadPersona >= 16 && edadPersona <= 18){
            System.out.println("puede usted entrar acompañado de un adulto");
        } else{
            System.out.println("No puede usted acceder a la fiesta");
        }
        scanner.close();
    }
}
