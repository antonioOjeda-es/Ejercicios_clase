package intities;

public class Gerente extends Empleado{

    //variables
    private boolean viajeDeNegocios;

    //constructor
    public Gerente(){}

    public Gerente(boolean viajeDeNegocios) {
        this.viajeDeNegocios = viajeDeNegocios;
    }

    public Gerente(String nombre, String apellido, int numeroEmpleado, boolean viajeDeNegocios) {
        super(nombre, apellido, numeroEmpleado);
        this.viajeDeNegocios = viajeDeNegocios;
    }

    //Getters y Setters
    public boolean isViajeDeNegocios() {
        return viajeDeNegocios;
    }

    public void setViajeDeNegocios(boolean viajeDeNegocios) {
        this.viajeDeNegocios = viajeDeNegocios;
    }

    //Métodos propios
    public void irDeViajeDeNeGocios(){
        this.viajeDeNegocios = true;
        System.out.println("El gerente " + this.getNombre() + " acaba de salir de viaje de negocios");

    }
    public void volverDeViajeDeNegocios(){
        this.viajeDeNegocios = true;
        System.out.println("El gerente"  + this.getNombre() + " acaba de volver de viaje de negocios");
    }

    //métodos de la clase padre
    @Override
    public void entrarAltrabajo() {
        System.out.println("El gerente"  + this.getNombre() + " acaba de entrar al su puesto de trabajo");
    }

    @Override
    public void salirDelTrabajo() {
        System.out.println("El gerente "  + this.getNombre() + " acaba de salir de su puesto de trabajo");
    }

    //to String
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre de empleado: " + getNombre() +
                ", Apellido de empleado: " + getApellido() +
                ", Número de empleado: " + getNumeroEmpleado() +
                ", Gerente{" +
                "viajeDeNegocios=" + viajeDeNegocios +
                '}';
    }
}
