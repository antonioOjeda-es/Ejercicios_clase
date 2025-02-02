import intities.Empleado;
import intities.Gerente;
import intities.Vendedor;

public class Main {
    public static void main(String[] args) {

        //creo empleado
        Empleado empleado = new Empleado("Alfredo", "Pérez", 1);

        //creo un gerente
        Gerente gerente1 = new Gerente("Juan", "Pérez", 3, true);
        Gerente gerente2 = new Gerente(true);

        //creo un vendedor
        Vendedor vendedor1 = new Vendedor("Alberto", "Osuna", 9, false);
        Vendedor vendedor2 = new Vendedor(true);

        //acciones:
        //a) clase empleado:
        empleado.nombreCompletoEmpleado();
        empleado.entrarAltrabajo();
        empleado.salirDelTrabajo();

        //b) de la clase gerente:
        gerente1.nombreCompletoEmpleado();
        gerente1.entrarAltrabajo();
        gerente1.salirDelTrabajo();

        //propias de la clase gerente
        gerente2.irDeViajeDeNeGocios();
        gerente2.volverDeViajeDeNegocios();

        //c) de la clase Vendedor
        vendedor1.nombreCompletoEmpleado();
        vendedor1.entrarAltrabajo();
        vendedor1.salirDelTrabajo();

        //propias de la clase vendedor
        vendedor1.hacerInventario();
        vendedor1.dejarDeHacerInventario();

        //imprimo los objetos
        System.out.println(empleado);
        System.out.println(gerente1);
        System.out.println(vendedor1);
    }
}