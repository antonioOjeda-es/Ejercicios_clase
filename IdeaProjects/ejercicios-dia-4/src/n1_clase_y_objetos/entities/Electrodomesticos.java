package n1_clase_y_objetos.entities;

public class Electrodomesticos {

    //declarar variables
    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    //Constructores
    public Electrodomesticos() {
    }

    public Electrodomesticos(int cod, String marca, double consumo, String modelo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.consumo = consumo;
        this.modelo = modelo;
        this.color = color;
    }

    //Getters y Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "cod=" + cod +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", color='" + color + '\'' +
                '}';
    }

}
