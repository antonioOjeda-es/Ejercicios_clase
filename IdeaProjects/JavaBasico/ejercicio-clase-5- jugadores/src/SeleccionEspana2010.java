import entities.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class SeleccionEspana2010 {
    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Porteros
        jugadores.add(new Jugador("Iker Casillas", "Portero", 1));
        jugadores.add(new Jugador("Pepe Reina", "Portero", 12));
        jugadores.add(new Jugador("Víctor Valdés", "Portero", 23));

        // Defensas
        jugadores.add(new Jugador("Gerard Piqué", "Defensa", 3));
        jugadores.add(new Jugador("Sergio Ramos", "Defensa", 15));
        jugadores.add(new Jugador("Carles Puyol", "Defensa", 5));
        jugadores.add(new Jugador("Joan Capdevila", "Defensa", 11));
        jugadores.add(new Jugador("Carlos Marchena", "Defensa", 4));
        jugadores.add(new Jugador("Raúl Albiol", "Defensa", 16));

        // Centrocampistas
        jugadores.add(new Jugador("Xavi Hernández", "Centrocampista", 8));
        jugadores.add(new Jugador("Andrés Iniesta", "Centrocampista", 6));
        jugadores.add(new Jugador("Sergio Busquets", "Centrocampista", 14));
        jugadores.add(new Jugador("Xabi Alonso", "Centrocampista", 14));
        jugadores.add(new Jugador("Pedro Rodríguez", "Centrocampista", 13));
        jugadores.add(new Jugador("Cesc Fàbregas", "Centrocampista", 10));

        // Delanteros
        jugadores.add(new Jugador("David Villa", "Delantero", 7));
        jugadores.add(new Jugador("Fernando Torres", "Delantero", 9));
        jugadores.add(new Jugador("Fernando Llorente", "Delantero", 18));

        // Imprimir todos los jugadores con un número de camiseta
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca número de camiseta de la selección Española:");

        //int camiseta = 7;
        int camiseta = scanner.nextInt();

        for (Jugador jugador : jugadores) {
            if(jugador.getCamiseta() == camiseta){
                System.out.println("jugador encontrado con la camiseta múmero: " + camiseta);
                System.out.println(jugador);
            }
        }

    }
}