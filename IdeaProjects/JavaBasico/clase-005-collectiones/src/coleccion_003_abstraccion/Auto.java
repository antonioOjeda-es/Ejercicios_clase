package coleccion_003_abstraccion;

//hay que poner abastrac al principio
public abstract class Auto extends Vehiculo{

    private String marca;

    //constructor(solo con parámetros)

    public Auto(String marca) {
        this.marca = marca;
    }
    public Auto(String marca) { super(marca); };

    //metodo implementado
    public void limpiarPrabrisas(){
        System.out.println("Limpiando parabrisas");
    }

    //se crean métodos abstractos para implementarse en hijos, no es para usarlo
    public abstract void arrancar();

    public abstract  void detener();
}
