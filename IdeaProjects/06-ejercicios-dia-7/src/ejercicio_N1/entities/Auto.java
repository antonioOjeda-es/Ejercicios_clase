package ejercicio_N1.entities;

public class Auto extends Vehiculo implements Electrico{

    private int capacidadBateria;
    private int autonomia;


    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    //Getters y Setters


    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    // de auto
    @Override
    public void edadVehiculo() {
        System.out.println("El el coche tiene: " + (2024 - getAnio()) + " años");
    }

    // de electrico
    @Override
    public void cargarEnergia() {
        System.out.println("El vehículo marca: " + getMarca() + " y modelo: " + getModelo() + " está cargando");
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
                "Auto{" +
                "capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                '}';
    }
}
