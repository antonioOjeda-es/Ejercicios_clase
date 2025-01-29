package vector_matrices_05_arreglos;

public class Array {

    public static void main(String[] args) {

        int [] numeros = new int [5];
        int [] numerosCorridos = {1,3,5,7,80,45,60,100};    //para crearlos de una vez

        //asignar valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for(int numero : numeros){
            System.out.println(numero);
        }

    }
}
