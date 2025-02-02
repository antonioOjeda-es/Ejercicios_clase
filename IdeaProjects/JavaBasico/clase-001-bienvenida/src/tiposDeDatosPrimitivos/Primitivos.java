package tiposDeDatosPrimitivos;

public class Primitivos {

    public static void main(String[] args) {
        //Tipo de datos

        //numeros;

        //+-127
        byte numeroByte = -127;
        //+-32767
        short numeroShort = 32767;

        int numeroInt = 2147458258;              //máximo
        long numeroLong = 2147452345234582585L; //debe de llevar L

        //decimales
        float numeroFloat = 3.15f; //debe de llevar el punto, se suele usar mas
        double numeroDouble = 3.1415; //decimales largos

        //caracteres:
        char caracter = 'J';        //comillas simples

        //esto es una clase de referencia
        String nombre = "Antonio";

        //Booleanos:
        boolean verdadero = true;

        System.out.println(numeroDouble);
    }

}
