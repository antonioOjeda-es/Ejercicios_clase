package n2_POO;

public class Principal {
    public static void main(String[] args) {

        //crear 5 personas
        Persona persona1 = new Persona(1, "Antonio", "Enrique de Egas", 41, 654387690);
        Persona persona2 = new Persona(2, "Alberto", "Competa", 30, 654321876);
        Persona persona3 = new Persona(3, "Jose Carlos", "Cervantes", 20, 643219876);
        Persona persona4 = new Persona(4, "Victor", "Carlos de Haya", 50, 632098765);
        Persona persona5 = new Persona(5, "Laura", "Arabial", 25, 698765432);

        //guardar a las personas en un vector
        Persona[] personas = new Persona[5];
        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        personas[4] = persona5;

        //recorrer el vector y mostrar el nombre y edad de cada persona
        System.out.println("____________________");
        System.out.println("Listado de personas:");
        System.out.println("____________________");

        for ( Persona persona : personas){
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        //mostrar nombre de dos personas antes y después del cambio
        //a- mostrar personas antes del cambio
        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println("Nombre de dos personas antes del cambio de nombre:");
        System.out.println("__________________________________________________");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Nombre: " + persona2.getNombre());

        //b- cambio el nombre de la persona1 y persona2
        persona1.setNombre("Calixto");
        persona2.setNombre("Diego");

        //c- mostrar nombre de las personas cuyo nombre ha sido cambiado
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("Nombre de dos personas después del cambio de nombre:");
        System.out.println("____________________________________________________");

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        //mostrar personas con edad mayor de 30
        System.out.println();
        System.out.println("____________________________");
        System.out.println("Personas mayores de 30 años:");
        System.out.println("____________________________");

        for (Persona persona : personas){
            if (persona.getEdad() > 30){
                System.out.println(persona.toString());
            }
        }
    }
}
