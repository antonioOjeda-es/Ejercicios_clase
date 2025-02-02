package ejercicio_N2;

public class Zapato extends  Vestimenta{

    //variables
    private String material;
    private String tipoCierre;

    //constructores
    public Zapato(){};

    public Zapato(String material, String tipoCierre) {
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public Zapato(int codigo, String nombre, double precio, String marca, int talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    //métodos propios
    @Override
    public String mostrarMarca() {
        return "Estos zapatos son de la marca: " + this.getMarca();
    }

    //toString
    @Override
    public String toString() {
        return "Vestimenta{" +
                "codigo=" + getCodigo() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", marca='" + getMarca() + '\'' +
                ", talla=" + getTalla() +
                ", color='" + getColor() + '\'' +
                '}' +
                "Zapato{" +
                "material='" + material + '\'' +
                ", tipoCierre='" + tipoCierre + '\'' +
                '}';
    }
}
