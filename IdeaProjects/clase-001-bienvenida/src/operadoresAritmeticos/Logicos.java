package operadoresAritmeticos;

public class Logicos {
    public static void main(String[] args) {

        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        System.out.println("Pude conducir " + (esMayorDeEdad && tieneLicencia));

        System.out.println("Podría conducir? " + (esMayorDeEdad || tieneLicencia));

        System.out.println("Comparar " + (tieneLicencia));

        System.out.println("Negación total " + (!esMayorDeEdad) );
    }
}
