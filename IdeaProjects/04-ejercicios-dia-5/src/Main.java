import ejercicio_N1_Repaso_POO.Verduras;

public class Main {
    public static void main(String[] args) {

        // Creación de 5 objetos Verduras
        Verduras verdura1 = new Verduras(1, "Zanahoria", "Naranja", 41, true);
        Verduras verdura2 = new Verduras(2, "Lechuga", "Verde", 15, false);
        Verduras verdura3 = new Verduras(3, "Tomate", "Rojo", 22, false);
        Verduras verdura4 = new Verduras(4, "Brócoli", "Verde", 34, true);
        Verduras verdura5 = new Verduras(5, "Cebolla", "Blanco", 40, true);


        //crear vector
        Verduras[] verduras = new Verduras[5];

        verduras[0] = verdura1;
        verduras[1] = verdura2;
        verduras[2] = verdura3;
        verduras[3] = verdura4;
        verduras[4] = verdura5;

        for(Verduras verdura : verduras){
            System.out.println("nombre de la verdura: " + verdura.getNombre() + ", con " + verdura.getCalorias());
        }

        //cambiar todos los datos de dos verduras
        verdura1.setId(1);
        verdura1.setNombre("Pimiento");
        verdura1.setColor("Rojo");
        verdura1.setCalorias(30);
        verdura1.setDebeCocinarse(true);

        verdura2.setId(2);
        verdura2.setNombre("Espinaca");
        verdura2.setColor("Verde");
        verdura2.setCalorias(23);
        verdura2.setDebeCocinarse(true);

        //volver a mostrar todas las verduras
        for(Verduras verdura : verduras){
            System.out.println(verdura);
        }
        //imprimir sólo las de color verde
        System.out.println("Las verduras de color verde son:");

        for(Verduras verdura : verduras){
            if(verdura.getColor().equals("Verde")) {
                System.out.println(verdura.toString());
            }
        }
    }
}