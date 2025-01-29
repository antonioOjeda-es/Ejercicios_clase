package coleccion_005_interfaces;

public class Perro implements Animal{
    @Override
    public String hacerSOnido() {
        return "Guau";
    }

    @Override
    public void ladrar() {
        System.out.println("El pedro está ladrando");
    }
}
