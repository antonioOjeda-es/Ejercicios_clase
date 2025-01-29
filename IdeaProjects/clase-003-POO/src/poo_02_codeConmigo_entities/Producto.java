package poo_02_codeConmigo_entities;

public class Producto {

    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private String categoria;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock, String descripcion, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public double calcularIva() {
        double iva = this.getPrecio() * 0.21;
        return iva;
    }

    public double calcularPrecioFinal(boolean clienteRegistrado) {

        double precioFinal = this.getPrecio();
        if (clienteRegistrado) {
            precioFinal = this.getPrecio() * 0.5;
        }
        return precioFinal;

    }
}
