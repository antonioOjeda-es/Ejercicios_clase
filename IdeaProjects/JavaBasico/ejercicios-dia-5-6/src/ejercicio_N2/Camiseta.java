package ejercicio_N2;

public class Camiseta extends Vestimenta {

    //variables
    private String manga;
    private String cuello;

    //constructores
    public Camiseta() {
    }

    ;

    public Camiseta(String manga, String cuello) {
        this.manga = manga;
        this.cuello = cuello;
    }

    public Camiseta(int codigo, String nombre, double precio, String marca, int talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    //Getters y Setters
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    //métodos propios
    @Override
    public String mostrarMarca() {
        return "Esta camiseta es de manga: " + getManga();
    }

    //toString
    @Override
    public String toString() {
        return "Vestimenta{" +
                "codigo=" + getCodigo() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", marca='" + getMarca() + '\'' +
                ", talla=" + getTalla() +
                ", color='" + getColor() + '\'' +
                '}' +
                "Camiseta{" +
                "manga='" + manga + '\'' +
                ", cuello='" + cuello + '\'' +
                '}';
    }
}
