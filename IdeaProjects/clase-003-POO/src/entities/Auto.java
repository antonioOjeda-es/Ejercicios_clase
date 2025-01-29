package entities;

//se escribe en PascalCase (el título de las clases)
//se escribe camel case (paquetes)
//se escribe snake_case (columnas de DB)

public class Auto {
    //declaramos los atributos
    private String color;
    private String marca;
    int velocidad;

    //constructores
    public Auto() {
    }

    public Auto(String color, String marca, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    //getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

     @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    //métodos
    public void acelerar(){
        //el código del método
    }

    public int frenar (int frenado){
        int calcule = frenado * 1000;
        return calcule;
    }

    public String acelerarAfondo (){
        int velocidad = this.velocidad * 2;
        this.setVelocidad(velocidad);
        return "Usted ahora va a " + velocidad + "km/h" ;
    }

    public String frenarUnPoco (int frenada){
        int frenadaTotal = this.velocidad - frenada;
        this.setVelocidad(velocidad);
        return "Usted va ahora a " + frenadaTotal + "kn/h";
    }

}
