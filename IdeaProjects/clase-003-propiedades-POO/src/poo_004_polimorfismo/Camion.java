package poo_004_polimorfismo;

import poo_001_002_abstraccion_Encapsulamiento.Auto;

public class Camion extends Auto {

    private Integer carga;

    //contructores


    public Camion(String marca, String modelo, String color, int velocidad, Integer carga) {
        super(marca, modelo, color, velocidad);
        this.carga = carga;
    }

    public Camion() {

    }

    //métodos de la clase
    public void cargarBasurero(){
        System.out.println("Cargando el basurero");
    }

    @Override
    public void acelerar() {
        System.out.println("El camión está acelerando de forma lenta");
    }
}
