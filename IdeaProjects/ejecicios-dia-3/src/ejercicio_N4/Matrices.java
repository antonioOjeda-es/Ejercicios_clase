package ejercicio_N4;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        //declaramos variables
        Scanner scanner = new Scanner(System.in);
        boolean elegirOtro = true;
        int eleccionFila;
        int eleccionColumna;
        String[][] asientos = {
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"}
        };
        //uso do/while para repetir en caso de que se elijan más asientos o se tenga un error al introducir datos
        do {
            //imprimir
            for (String[] fila : asientos) {
                for (String columna : fila) {

                    System.out.print(columna + "  ");
                }
                System.out.println();
            }

            //hago try/catch para controlar el error cuando no se introduce correctamente fila o columnas o los tipo
            //de datos introducidos son erróneos
            try {

                //preguntamos por la fila y el asiento que quiere
                System.out.println("Que fila quiere ocupar?");
                eleccionFila = scanner.nextInt() - 1;

                //limpio buffer, sinó se salta la pregunta
                scanner.nextLine();

                System.out.println("Que Asiento quiere ocupar?");
                eleccionColumna = scanner.nextInt() - 1;

                //limpio buffer, sinó se salta la pregunta
                scanner.nextLine();

                //compruebo e introduzco el cambio para la ocupación del asiento de "O" a "X"
                if (asientos[eleccionFila][eleccionColumna].equals("O")) {
                    //cambiamos el carácter para indicar que el asiento se queda ocupado
                    asientos[eleccionFila][eleccionColumna] = "X";

                    System.out.println("El Asiento "+ (eleccionColumna + 1) + " de la fila " + (eleccionFila + 1) +
                            " acaba de ser reservado por usted");

                    //preguntamos por si quiere otro asiento
                    System.out.println("Desea elegir otro asiento?: si/no");
                    String OtroAsiento = scanner.nextLine();

                    //valoramos la elección:
                    if (OtroAsiento.equalsIgnoreCase("no") || OtroAsiento.equalsIgnoreCase("n")) {
                        elegirOtro = false;
                    }

                } else {
                    System.out.println("Asiento ocupado, elija otro asiento diferente");
                }

            }
            //En el caso de que el asiento no exista
            catch (IndexOutOfBoundsException e) {
                System.out.println("El asiento introducido no existe");
            }
            //En el caso de que el carácter introducido no es un número entero
            catch (Exception e) {
                //limpio buffer para limpiar la línea
                scanner.nextLine();
                System.out.println("Asiento seleccionado mal introducido, por favor, elija otro");
            }

        } while (elegirOtro);

        //Mensaje de salida
        System.out.println("Hasta la próxima");
    }
}
