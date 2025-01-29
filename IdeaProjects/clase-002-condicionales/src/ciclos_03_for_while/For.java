package ciclos_03_for_while;

public class For {
    public static void main(String[] args) {
        //ciclo con limites
        //inicio; condición; modificador
        /*
        for (int i = 0; i <= 5; i++){
            System.out.println("Estoy en la vuelta Nº " + i);
        }

         */
        String[] peliculas = {"El padrino", "Matrix", "Intelestelar", "Pulp Fiction"};
        /*

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("la pelicula número " + (i +1) + " es " + peliculas[i]);
        }

         */

        for(String pelicula : peliculas){
            System.out.println(pelicula);
        }

    }
}
