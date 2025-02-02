package ejercicio_N2;

public class Sombrero extends Vestimenta {

    //variables
    private String tipo;
    private int tamanio;

    //Constructores
    public Sombrero() {
    }

    ;

    public Sombrero(String tipo, int tamanio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, int talla, String color, String tipo, int tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    //métodos propios
    @Override
    public String mostrarMarca() {
        return "Este sombrero es de tipo: " + getTipo();
    }

    //toSTring
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
                "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
