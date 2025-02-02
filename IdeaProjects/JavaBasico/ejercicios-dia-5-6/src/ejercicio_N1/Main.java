package ejercicio_N1;

public class Main {
    public static void main(String[] args) {

        //instanciar objetos
        Animal cobaya = new Mamifero(1, 2,"peluda", "semillas", 4, "ovovivípara", "marrón y blanco", "ni idea");
        Animal canario = new Ave(1, 2, "plumada", "Alpiste", "10", "poca distancia", "color amarillo liso", "pico corto");
        Animal iguana = new Reptil(1, 3, "escamosa", "carne y frutas", 1, "escamas tuberculares", "no presenta", "tropial" );

        //método saludar
        cobaya.saludar();
        canario.saludar();
        iguana.saludar();

        //d)crear objeto animal
        Animal animal = new Animal(1, 5,"peluda", "carne");
        Mamifero perro = new Mamifero(4, "ovovivípara", "marrón y negro", "casa");

        //no se puede introducir el objeto en sí pero se puede introducir utilizando los métodos ser
        perro.setId(animal.getId());
        perro.setEdad(animal.getEdad());
        perro.setTipoDePiel(animal.getTipoDePiel());
        perro.setTipodeAlimentacion(animal.getTipodeAlimentacion());


        //al modificar los métodos de public a private, no no puedo acceder a ninguno de sus métodos

    }
}