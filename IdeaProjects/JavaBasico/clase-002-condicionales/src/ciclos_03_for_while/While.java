package ciclos_03_for_while;

public class While {
    public static void main(String[] args) {

        String[] peliculas = {"El padrino", "Matrix", "Intelestelar", "Pulp Fiction"};
        int i = 0;

        while(i < peliculas.length){
            System.out.println(peliculas[i]);
            i++;
        }
    }
}
