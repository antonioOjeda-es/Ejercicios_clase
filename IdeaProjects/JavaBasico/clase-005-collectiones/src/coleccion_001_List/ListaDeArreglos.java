package coleccion_001_List;

import java.util.ArrayList;

public class ListaDeArreglos {
    public static void main(String[] args) {
        //arraylist:
        //

        ArrayList<String> miLista = new ArrayList<>();

        //agregar
        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Cereza");

        String fruta = miLista.get(0);
        System.out.println(fruta);

        //podemos usar, get, size, remove
        miLista.remove(1);

        int size = miLista.size();
        System.out.println(size);

        //imprimir
        for(String elemento : miLista){
            System.out.println(elemento);
        }


        //para objetos: User

        ArrayList<User> usuarios = new ArrayList<>();

        usuarios.add(new User(1, "Brian", 31));
        usuarios.add(new User(2,"Antonio", 41));


    }
}
