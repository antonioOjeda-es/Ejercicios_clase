package poo_02_codeConmigo_entities;

public class Princpal {
    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.setNombre("Torta");
        producto.setPrecio(200);
        producto.setDescripcion("Una torta rica");
        producto.setStock(200);
        producto.setCategoria("Tortas");

        System.out.println(producto.calcularIva());

        System.out.println(producto.calcularPrecioFinal(true));

        Producto producto1 = new Producto("Galletitas", 17.20, 200, "Galletas con azucar", "Comestibles");
    }


}
