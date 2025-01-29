import poo_001_002_abstraccion_Encapsulamiento.Auto;
import poo_003_herencia.AutoDeportivo;
import poo_004_polimorfismo.Camion;

public class Main {
    public static void main(String[] args) {
        /*

        //abstracción y encapsulamiento(clase Auto)
        Auto autoNormal = new Auto("Toyota","corolla", "negro", 8 );

        autoNormal.acelerar();
        autoNormal.acelerar();
        autoNormal.frenar();


        //herencia
        AutoDeportivo ferrari = new AutoDeportivo("Toyota","corolla", "negro", 8, false);

        ferrari.acelerar();
        //usamos acelerar: pone en true el turbo
        ferrari.activarTurbo();
        ferrari.acelerar();
        ferrari.frenar();

         */

        //polimorfismo
        Camion camion = new Camion();
        camion.acelerar();
    }
}