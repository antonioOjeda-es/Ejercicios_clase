package ejercicio_N1.entities;

public class Moto extends Vehiculo implements Combustion{

    private int cilindrada;
    private String tipoMotor;

    //constructores
    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    //Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    // de Combustión
    @Override
    public void cargarCombustible() {
        System.out.println("La moto esta repostando su combustible");
    }
    //de aVehículo
    @Override
    public void edadVehiculo() {
        System.out.println("La moto tiene: " + (2024 - getAnio()) + " años");
    }

    //toString

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + getId() +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anio=" + getAnio() +
                ", costo=" + getCosto() +
                '}' +
                "Moto{" +
                "cilindrada=" + cilindrada +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}
