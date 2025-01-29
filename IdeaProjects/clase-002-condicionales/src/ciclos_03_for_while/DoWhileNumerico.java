package ciclos_03_for_while;

public class DoWhileNumerico {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("Esta es mi vuelta: " + contador);
            System.out.println("Hola Antonio");
            contador ++;
        }while(contador < 10);
    }
}
