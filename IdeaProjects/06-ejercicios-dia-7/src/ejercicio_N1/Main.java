package ejercicio_N1;

import ejercicio_N1.entities.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //crear objetos
        Auto auto1 = new Auto(1, "8060czr", "Skoda", "Fabia", 2004, 12000, 20000, 800);
        Camioneta camioneta1 = new Camioneta(2, "9686vde", "ford", "Transit", 2020, 14000, 80, 5);
        Moto moto1 = new Moto(3, "8675tre", "Suzuki", "Switch", 2023, 3000, 1200, "Dos tiempos");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto1);
        vehiculos.add(camioneta1);
        vehiculos.add(moto1);

        // Muestra información sobre cada uno de ellos,
        // incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
            vehiculo.edadVehiculo();

            //para averiguar la clase, se puede hacer de esta forma:
            if (vehiculo instanceof Auto) {
                ((Auto) vehiculo).cargarEnergia();
            }else if (vehiculo instanceof Camioneta){
                ((Combustion) vehiculo).cargarCombustible();
            }else{
                System.out.println("El vehículo no es apto para cargar ningún tipo de energía");
            }
        }

        //mostrar información de cada uno de ellos
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }

}
