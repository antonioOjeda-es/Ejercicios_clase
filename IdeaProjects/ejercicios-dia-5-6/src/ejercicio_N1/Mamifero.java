package ejercicio_N1;

public class Mamifero extends Animal{
    //variables
    private int numeroDePatas;
    private String tipoDeReproduccion;
    private String colorDePelaje;
    private String habitat;

    //constructor
    public Mamifero(){};

    public Mamifero(int numeroDePatas, String tipoDeReproduccion, String colorDePelaje, String habitat) {
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDePelaje = colorDePelaje;
        this.habitat = habitat;
    }

    public Mamifero(int id, int edad, String tipoDePiel, String StipoDeAlimentacion, int numeroDePatas, String tipoDeReproduccion, String colorDePelaje, String habitat) {
        super(id, edad, tipoDePiel, StipoDeAlimentacion);
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDePelaje = colorDePelaje;
        this.habitat = habitat;
    }

    //Getters y Setters
    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getTipoDeReproduccion() {
        return tipoDeReproduccion;
    }

    public void setTipoDeReproduccion(String tipoDeReproduccion) {
        this.tipoDeReproduccion = tipoDeReproduccion;
    }

    public String getColorDePelaje() {
        return colorDePelaje;
    }

    public void setColorDePelaje(String colorDePelaje) {
        this.colorDePelaje = colorDePelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //sobreescribir métodos calse padre Animal

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola soy un mamífero");
    }


    //to String

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + getId() +
                ", edad='" + getEdad() + '\'' +
                ", tipoDePiel='" + getTipoDePiel() + '\'' +
                ", StipoDeAlimentacion='" + getTipoDePiel() + '\'' +
                '}' +
                "Mamifero{" +
                "numeroDePatas=" + numeroDePatas +
                ", tipoDeReproduccion='" + tipoDeReproduccion + '\'' +
                ", colorDePelaje='" + colorDePelaje + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
