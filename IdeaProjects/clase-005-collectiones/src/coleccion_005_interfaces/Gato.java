package coleccion_005_interfaces;

public class Gato implements Animal {


    @Override
    public String hacerSOnido() {
        return "miau";
    }

    @Override
    public void ladrar() {
        System.out.println("El gato está ladrando");
    }
}
