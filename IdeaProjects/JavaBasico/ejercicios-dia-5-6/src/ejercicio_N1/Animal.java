package ejercicio_N1;

public class Animal {

    //variables
    private int id;
    private int edad;
    private String tipoDePiel;
    private String tipoDeAlimentacion;

    //constructores
    public Animal(){};

    public Animal(int id, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        this.id = id;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    public String getTipodeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipodeAlimentacion(String tipoDeAlimentacion) {
        tipoDeAlimentacion = tipoDeAlimentacion;
    }

    //métodos propios
    public void saludar(){
        System.out.println("Soy un animal");
    }

    //to String

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", edad='" + edad + '\'' +
                ", tipoDePiel='" + tipoDePiel + '\'' +
                ", tipoDeAlimentacion='" + tipoDeAlimentacion + '\'' +
                '}';
    }
}
