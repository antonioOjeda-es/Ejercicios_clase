package coleccion_001_List;

import java.util.LinkedList;

public class ListaEnlazada {
    public static void main(String[] args) {
        //LinkedList: permite almacenar una lista doblemente enlazada(con el objeto anterior y posterior de la lista)
        //al agregar o eliminar un elemento, todos cambian de puesto
        //para llegar a un elemento hay que empezar desde el principio(es una desventaja)

        //instanciar
        LinkedList<String> miListaEnlazada = new LinkedList<>();

        //insertar elementos
        miListaEnlazada.add("manzana");
        miListaEnlazada.add("Banana");
        miListaEnlazada.add("Cereza");

        //insertar elementos en un indice(desplaza los demás elementos
        miListaEnlazada.add(1, "uva");

        //eliminar un elemento
        miListaEnlazada.remove(2);

        //tamaño de la lista
        int size = miListaEnlazada.size();



        //capturar elemento con get
        String valor =miListaEnlazada.get(2);
        System.out.println("-----------------");
        System.out.println(valor);
        System.out.println("-----------------");


        //ver los elementos
        System.out.println();
        System.out.println("Lista con forEach");
        System.out.println("-----------------");


        for(String elemento : miListaEnlazada){
            System.out.println(elemento);
        }
        System.out.println();
        System.out.println("Lista con contador");
        System.out.println("------------------");

        for (int i = 0; i < miListaEnlazada.size(); i++) {
            System.out.println(miListaEnlazada.get(i));
        }


    }
}
