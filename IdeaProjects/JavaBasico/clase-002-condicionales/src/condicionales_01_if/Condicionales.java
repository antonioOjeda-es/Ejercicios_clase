package condicionales_01_if;

public class Condicionales {
    public static void main(String[] args) {
        double estaturaJuego = 0.67;
/*
        if (estaturaJuego >= 1.50){
            System.out.println("Puedes subir al juego");
        }else {
            System.out.println("No puedes subir al juego");
        }

 */
        double estatura = 1.47;
        double edad = 14;
        //evaluamos la altura
        if(estatura >= 1.50){
            //evaluamos la estura maxima
            if(estatura >= 1.95){
                System.out.println("Puede subir al juego");
            }else{
                System.out.println("Si bien cumples con la estatura, eres un grandote para este juego");
            }
        }else{
            //si no cumple la estatura mínima, evaluamos la edad
            if(edad <= 12){
                System.out.println("Usted no tiene la altura mínima, pero puede juagar a los juegos infantiles");
            }else{
                System.out.println("Usted no tiene la altura mínima, pero puede juagar a los juegos adolescentes");
            }
        }

    }
}
