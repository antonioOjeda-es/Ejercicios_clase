package intities;


public class Vendedor extends Empleado{

    //variables
    private boolean haciendoInventario;

    //Constructores
    public Vendedor(){};

    public Vendedor(boolean haciendoInventario) {
        this.haciendoInventario = haciendoInventario;
    }

    public Vendedor(String nombre, String apellido, int numeroEmpleado, boolean haciendoInventario) {
        super(nombre, apellido, numeroEmpleado);
        this.haciendoInventario = haciendoInventario;
    }

    //Getters y Setters
    public boolean getHaciendoInventario() {
        return haciendoInventario;
    }

    public void setHaciendoInventario(boolean haciendoInventario) {
        this.haciendoInventario = haciendoInventario;
    }

    //Métodos propios
    public void hacerInventario(){
        System.out.println("El vendedor "  + this.getNombre() + " está haciendo inventario de la tienda");
    }
    public void dejarDeHacerInventario(){
        System.out.println("El vendedor "  + this.getNombre() + " está con sus tareas comunes");
    }

    //métodos de la clase padre
    @Override
    public void entrarAltrabajo() {
        System.out.println("El vendedor "  + this.getNombre() + " acaba de salir del trabajo");
    }

    @Override
    public void salirDelTrabajo() {
        System.out.println("El vendedor " + this.getNombre() + " acaba de salir del trabajo");
    }

    //to String
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre de empleado: " + getNombre() +
                ", Apellido de empleado: " + getApellido() +
                ", Número de empleado: " + getNumeroEmpleado() +
                ", Vendedor{" +
                "haciendoInventario= " + haciendoInventario +
                '}';
    }
}
