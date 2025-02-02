package poo_001_002_abstraccion_Encapsulamiento;

public class Auto {
    //public en todo el proyecto
    //protected en el mismo paquete
    //private en la clase

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //métodos personalizados
    public void frenar(){
        this.velocidad -= 10;
        System.out.println("El auto está ahora a: " + velocidad + "Hm/h");


    }
    public void acelerar(){
        this.velocidad += 10;
        System.out.println("El auto está ahora a: " + velocidad + "Hm/h");

    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad='" + velocidad + '\'' +
                '}';
    }
}
