package coleccion_003_abstraccion;

public class Vehiculo {

    private String modelo;

    public Vehiculo(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    public Vehiculo(String marca) {
        super(marca);
    }


    //métodos implementados de clase abstracta Auto
    @Override
    public void arrancar() {
        System.out.println("El vehículo " + this.modelo + " ha arrancado");
    }

    @Override
    public void detener() {
        System.out.println("El auto " + this.modelo +" está detenido");
    }
}
