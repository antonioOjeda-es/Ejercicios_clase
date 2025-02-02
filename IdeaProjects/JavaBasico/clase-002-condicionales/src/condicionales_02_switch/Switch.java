package condicionales_02_switch;

public class Switch {

    public static void main(String[] args) {

        int destino = 4;

        double costoEnvio = 5.0;

        switch (destino){
            case 1:
                costoEnvio = 5.0;
                break;
            case 2:
                costoEnvio = 7.5;
                break;
            case 3:
                costoEnvio = 6.0;
                break;
            case 4:
                costoEnvio = 8.0;
                break;
            default:
                costoEnvio = 0.0;
        }
        System.out.println("El costo del envío a destino " + destino + " es: $" + costoEnvio);
    }
}
