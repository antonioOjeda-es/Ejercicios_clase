package coleccion_001_List;

public class User {

    private int id;
    private String nombre;
    private int age;

    //constructores
    public User(){};

    public User(int id, String nombre, int age) {
        this.id = id;
        this.nombre = nombre;
        this.age = age;
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", age=" + age +
                '}';
    }
}
