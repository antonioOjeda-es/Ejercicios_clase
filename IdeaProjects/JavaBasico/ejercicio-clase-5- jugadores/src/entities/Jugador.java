package entities;

public class Jugador {
    //variables
    private String nombre;
    private String posicion;
    private int camiseta;

    //constructores
    public Jugador(){};

    public Jugador(String nombre, String posicion, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.camiseta = camiseta;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    //toString

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", camiseta=" + camiseta +
                '}';
    }
}
