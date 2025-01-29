package ejercicio_N1;

public class Ave extends Animal{

    //variables
    private String envergaduraDeAlas;
    private String tipoDeVuelo;
    private String colorPlumaje;
    private String tipoDePico;

    //constructor
    public Ave(){};

    public Ave(String envergaduraDeAlas, String tipoDeVuelo, String colorPlumaje, String tipoDePico) {
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoDePico = tipoDePico;
    }

    public Ave(int id, int edad, String tipoDePiel, String StipoDeAlimentacion, String envergaduraDeAlas, String tipoDeVuelo, String colorPlumaje, String tipoDePico) {
        super(id, edad, tipoDePiel, StipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoDePico = tipoDePico;
    }

    //Getters y Setters
    public String getEnvergaduraDeAlas() {
        return envergaduraDeAlas;
    }

    public void setEnvergaduraDeAlas(String envergaduraDeAlas) {
        this.envergaduraDeAlas = envergaduraDeAlas;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoDePico() {
        return tipoDePico;
    }

    public void setTipoDePico(String tipoDePico) {
        this.tipoDePico = tipoDePico;
    }

    //sobreescribir método clase padre Animal
    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola soy un ave");
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
                "Ave{" +
                "envergaduraDeAlas='" + envergaduraDeAlas + '\'' +
                ", tipoDeVuelo='" + tipoDeVuelo + '\'' +
                ", colorPlumaje='" + colorPlumaje + '\'' +
                ", tipoDePico='" + tipoDePico + '\'' +
                '}';
    }
}
