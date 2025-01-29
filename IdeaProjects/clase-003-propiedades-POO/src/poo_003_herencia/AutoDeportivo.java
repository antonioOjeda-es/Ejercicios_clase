package poo_003_herencia;

import poo_001_002_abstraccion_Encapsulamiento.Auto;

//esta clase es hija de la clas Auto, adquiere el objeto Auto además de poder sobreescribir y crear nuevos métodos
public class AutoDeportivo extends Auto {
    //variables
    boolean turboActivado;


    public AutoDeportivo(String marca, String modelo, String color, int velocidad, boolean turboActivado) {
        super(marca, modelo, color, velocidad);
        this.turboActivado = turboActivado;
    }

    //métodos de propios de esta clase
    public void activarTurbo(){
        this.turboActivado = true;
        System.out.println("Turbo activado");
    }

    @Override
    public void acelerar() {
        if(turboActivado){
            System.out.println("El auto deportivo utilizó el turbo");
        }else{
            System.out.println("El auto deportivo aceleró pero no utilizó el turbo");
        }
    }
}
