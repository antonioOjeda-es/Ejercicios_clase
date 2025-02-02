package ejercicio_N2;

public class Pantalon extends Vestimenta {

    //variables
    private String estilo;
    private String ripoTejido;

    //Constructores
    public Pantalon() {
    }

    ;

    public Pantalon(String estilo, String ripoTejido) {
        this.estilo = estilo;
        this.ripoTejido = ripoTejido;
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, int talla, String color, String estilo, String ripoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.ripoTejido = ripoTejido;
    }

    //Getters y Setters
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getRipoTejido() {
        return ripoTejido;
    }

    public void setRipoTejido(String ripoTejido) {
        this.ripoTejido = ripoTejido;
    }

    //métodos propios
    @Override
    public String mostrarMarca() {
        return "Estos pantalón son de estilo: " + getEstilo();
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
                "Pantalon{" +
                "estilo='" + estilo + '\'' +
                ", ripoTejido='" + ripoTejido + '\'' +
                '}';
    }
}
