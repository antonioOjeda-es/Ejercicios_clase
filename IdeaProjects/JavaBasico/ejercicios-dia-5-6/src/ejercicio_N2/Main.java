package ejercicio_N2;

public class Main {
    public static void main(String[] args) {
        // Objetos Camiseta
        Vestimenta camiseta1 = new Camiseta(1, "Camiseta Clásica", 19.99, "Nike", 42, "Blanco", "Corta", "Redondo");
        Vestimenta camiseta2 = new Camiseta(2, "Camisa Polo", 29.99, "Lacoste", 40, "Azul", "Larga", "Polo");

        // Objetos Pantalón
        Vestimenta pantalon1 = new Pantalon(4, "Jeans Slim", 59.99, "Levi's", 42, "Azul", "Slim", "Denim");
        Vestimenta pantalon2 = new Pantalon(5, "Pantalones Cargo", 49.99, "The North Face", 40, "Verde", "Cargo", "Algodón");
        Vestimenta pantalon3 = new Pantalon(6, "Pantalones de Vestir", 79.99, "Hugo Boss", 42, "Negro", "Formal", "Lana");

        // Objetos Sombrero
        Vestimenta sombrero1 = new Sombrero(7, "Gorra de Béisbol", 24.99, "New Era", 58, "Gris", "Deportivo", 56);

        // Objetos Zapato
        Vestimenta zapato1 = new Zapato(10, "Zapatillas Running", 89.99, "Nike", 42, "Blanco", "Sintético", "Cordones");
        Vestimenta zapato2 = new Zapato(11, "Zapatos de Vestir", 129.99, "Clarks", 43, "Marrón", "Cuero", "Hebilla");
        Vestimenta zapato3 = new Zapato(12, "Botas de Senderismo", 159.99, "Merrell", 42, "Marrón Oscuro", "Cuero", "Cremallera");

        //voy a almacenarlos en un vector
        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = camiseta1;
        vestimentas[1] = camiseta2;
        vestimentas[2] = pantalon1;
        vestimentas[3] = pantalon2;
        vestimentas[4] = pantalon3;
        vestimentas[5] = sombrero1;
        vestimentas[6] = zapato1;
        vestimentas[7] = zapato2;
        vestimentas[8] = zapato3;

        //recorrer el vector para mostar el método mostrarMarca() de cada subclase,
        // sobreescribiendo sobre la clase padre.
        for(Vestimenta vestimenta : vestimentas){
            System.out.println(vestimenta.mostrarMarca());
        }

    }
}
