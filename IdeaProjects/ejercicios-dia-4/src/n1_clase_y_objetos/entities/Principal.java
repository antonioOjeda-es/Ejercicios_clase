package n1_clase_y_objetos.entities;

public class Principal {
    public static void main(String[] args) {

        //creación del objeto vacío
        Electrodomesticos electrodomestico = new Electrodomesticos();

        //creación del objeto con parámetros
        Electrodomesticos electrodomestico1 = new Electrodomesticos(1, "Samsung", 45.0, "Lavadora", "blanco");
        Electrodomesticos electrodomestico2 = new Electrodomesticos(2, "Lg", 100.0, "Secadora", "gris");
        Electrodomesticos electrodomestico3 = new Electrodomesticos(3, "Balay", 15.0, "Nevera", "Metalizado");

        //mostrar marca y modelo
        System.out.println("Marca: " + electrodomestico1.getMarca() + ", Modelo: " + electrodomestico1.getModelo() + ", Consumo: " + electrodomestico1.getConsumo());
        System.out.println("Marca: " + electrodomestico2.getMarca() + ", Modelo: " + electrodomestico2.getModelo() + ", Consumo: " + electrodomestico2.getConsumo());
        System.out.println("Marca: " + electrodomestico3.getMarca() + ", Modelo: " + electrodomestico3.getModelo() + ", Consumo: " + electrodomestico3.getConsumo());

        //intento obtener la marca de un objeto vacío
        System.out.println(electrodomestico.getMarca()); // el resultado es null
    }
}
