package coleccion_002_map;

import coleccion_001_List.User;

import java.util.HashMap;
import java.util.Map;

public class MapasTren {

    public static void main(String[] args) {

        //declarar: clave y valor con tipo de dato
        Map<Integer, String> tren = new HashMap<>();

        //añadir elementos
        //crea un hash sobre la clave que hemos puesto (asdgadyhsdjhgm)
        tren.put(52, "Libros");
        tren.put(1,"Juego de mesa");
        tren.put(14, "Teléfono");//si se repite la clave y se cambia el valor, toma el último

        Integer vagon = 1;


        //imprimir elementos, poniendo get con la clave creada
        System.out.println("El contenido del vagón número " + vagon + " es un " + tren.get(vagon));

    }
}
