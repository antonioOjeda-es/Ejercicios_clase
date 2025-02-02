package ejercicio_N1.entities;

public class Camioneta extends Vehiculo implements  Combustion{

    private int capacidadTanque;
    private int consumoCombustible;


    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
    }

    public int isCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void edadVehiculo() {
        System.out.println("El el camión tiene: " + (2024 - getAnio()) + " años");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("El vehículo está repostando combustible");
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
                "Camioneta{" +
                "capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                '}';
    }
}
