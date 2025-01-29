package intities;

public class Empleado {

    //variables
    private String nombre;
    private String apellido;
    private int numeroEmpleado;

    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int numeroEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroEmpleado = numeroEmpleado;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    //métodos propios
    public void entrarAltrabajo(){
        System.out.println("El empleado acaba de entrar al trabajo");
    }
    public void salirDelTrabajo(){
        System.out.println("El empleado acaba de salir del trabajo");

    }

    //método para demostrar privado:
    //creo un método privado
    private String concatenarNombreApellido(){
        return this.nombre + " " + this.apellido;
    }

    //llamo al método concatenarNombreApellido(), pero solo es aparecerá en esta clase
    public void nombreCompletoEmpleado(){
        System.out.println(concatenarNombreApellido());
    }


    //to String
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroEmpleado='" + numeroEmpleado + '\'' +
                '}';
    }
}
