package ejercicio_N1;

public class Reptil extends Animal{

    //variables
    private double longitud;
    private String tipoDeEscamas;
    private String tipoDeVeneno;
    private String habitat;

    //Constructores
    public Reptil(){}

    public Reptil(double longitud, String tipoDeEscamas, String tipoDeVeneno, String habitat) {
        this.longitud = longitud;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoDeVeneno = tipoDeVeneno;
        this.habitat = habitat;
    }

    public Reptil(int id, int edad, String tipoDePiel, String StipoDeAlimentacion, double longitud, String tipoDeEscamas, String tipoDeVeneno, String habitat) {
        super(id, edad, tipoDePiel, StipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoDeVeneno = tipoDeVeneno;
        this.habitat = habitat;
    }

//Getters y Setters

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoDeEscamas() {
        return tipoDeEscamas;
    }

    public void setTipoDeEscamas(String tipoDeEscamas) {
        this.tipoDeEscamas = tipoDeEscamas;
    }

    public String getTipoDeVeneno() {
        return tipoDeVeneno;
    }

    public void setTipoDeVeneno(String tipoDeVeneno) {
        this.tipoDeVeneno = tipoDeVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //sobreescribir métodos clase padre Animal
    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola soy un reptil");
    }

    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + getId() +
                ", edad='" + getEdad() + '\'' +
                ", tipoDePiel='" + getTipoDePiel() + '\'' +
                ", StipoDeAlimentacion='" + getTipoDePiel() + '\'' +
                '}' +
                "Reptil{" +
                "longitud=" + longitud +
                ", tipoDeEscamas='" + tipoDeEscamas + '\'' +
                ", tipoDeVeneno='" + tipoDeVeneno + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}


