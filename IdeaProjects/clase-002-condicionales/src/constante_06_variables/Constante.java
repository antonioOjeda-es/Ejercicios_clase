package constante_06_variables;

public class Constante {

    public static final double PI = 3.14151659;
    public static final String NOMBRE_APP = "AntonioApp";

    public static void main(String[] args) {

        System.out.println("El nombre es: " + NOMBRE_APP);

        String nombre = "Antonio";
        String nombre2 = "Antonio";
        String cadena = "  Esto es una cadena de texto";

        //ignorar si es mayuscula o minusculas con el metodo equals de la clas String
        if (nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Si son iguales");
        }else {
            System.out.println("No son iguales");
        }
        System.out.println(cadena);
        //trim quita espacios al principio
        System.out.println(cadena.trim());

    }
}
