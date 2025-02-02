import entities.Auto;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();
        //seteamos variables del objeto auto
        auto.setColor("Gris");
        auto.setMarca("Toyota");
        auto.setVelocidad(300);

        Auto auto2 = new Auto("rojo", "Hyundai", 200);

        //hago get a los objetos
        String colorAuto = auto.getColor();
        String marcAuto = auto.getMarca();
        int velocidadAuto = auto.getVelocidad();

        System.err.println("El color del auto es:" + colorAuto + ", con la marca: " + marcAuto + ", y velocidad máxima: " + velocidadAuto);

        //se puede usar "err" en vez de "out" para imprimir en rojo algo y localizarlo rapidamente (truco)
        System.err.println(auto.toString());

        //metodo que duplique la velocidad a del auto y que me de un mensaje diciendo "Usted ahora va a 400km/h

        String autoLLeno = auto2.acelerarAfondo();
        System.out.println(autoLLeno); //400

        //que le pase un parámetro para frenar 200 kilometros

        String totalFrenada = auto.frenarUnPoco(200);
        System.out.println(totalFrenada); //100

    }
}