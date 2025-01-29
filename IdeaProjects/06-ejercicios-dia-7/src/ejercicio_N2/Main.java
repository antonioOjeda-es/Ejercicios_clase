package ejercicio_N2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto portatilGaming = new Producto(1001, "Portátil ROG Strix G15", "ASUS", "Ordenador Portátil", 1200.50, 1599.99, 25);
        Producto monitor4K = new Producto(1002, "Monitor UltraWide", "LG", "Monitor", 350.75, 499.99, 40);
        Producto smartphonePro = new Producto(1003, "iPhone 15 Pro", "Apple", "Smartphone", 900.00, 1299.99, 50);
        Producto tarjetaGrafica = new Producto(1004, "GeForce RTX 4070", "NVIDIA", "Componente PC", 550.25, 799.99, 15);
        Producto tecladoMecanico = new Producto(1005, "Teclado Mecánico RGB", "Razer", "Periférico", 120.50, 189.99, 35);
        Producto ratonGaming = new Producto(1006, "Ratón Wireless Gamer", "Logitech", "Periférico", 75.25, 129.99, 45);
        Producto tablet = new Producto(1007, "Galaxy Tab S9", "Samsung", "Tablet", 450.00, 649.99, 30);
        Producto ssd = new Producto(1008, "SSD NVMe 1TB", "Western Digital", "Almacenamiento", 95.50, 149.99, 55);
        Producto auriculares = new Producto(1009, "AirPods Pro", "Apple", "Audio", 180.75, 249.99, 40);
        Producto impresora = new Producto(1010, "Impresora Láser Color", "HP", "Impresora", 220.00, 349.99, 20);


        //creo un arrayList
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(portatilGaming);
        productos.add(monitor4K);
        productos.add(smartphonePro);
        productos.add(tarjetaGrafica);
        productos.add(tecladoMecanico);
        productos.add(ratonGaming);
        productos.add(tablet);
        productos.add(ssd);
        productos.add(auriculares);
        productos.add(impresora);

        //mostrar todos los productos

        System.out.println("Lista de productos");
        System.out.println("__________________");
        for(Producto producto : productos){
            System.out.println(producto);
        }

        //determinar el precio máximo
        double precioMaximo = Double.MIN_VALUE;
        Producto productoGuardado = new Producto();

        for(Producto producto : productos){
            if(producto.getPrecioVenta() > precioMaximo){
                precioMaximo = producto.getPrecioVenta();
                productoGuardado = producto;
            }
        }
        System.out.println("El precio maximo de venta de todos los productos es: " + precioMaximo + "€, y su nombre es: " + productoGuardado.getNombre());

        //determinar el precio mínimo
        double precioMínimo = Double.MAX_VALUE;

        for(Producto producto : productos){
            if(producto.getPrecioVenta() < precioMaximo){
                precioMaximo = producto.getPrecioVenta();
                productoGuardado = producto;
            }
        }
        System.out.println("El precio mínimo de venta de todos los productos es: " + precioMaximo + "€, y su nombre es: " + productoGuardado.getNombre());


        //borrar la posición 5 del ArrayList
        Producto productoEliminado = productos.remove(4);
        System.out.println("El producto eliminado es el: " + productoEliminado);

        //deteminar mayor canticad de estock

        int stockMaximo = Integer.MIN_VALUE;
        for(Producto producto : productos){
            if(producto.getPrecioVenta() < stockMaximo){
                stockMaximo = producto.getCantidadEnStock();
                productoGuardado = producto;
            }
        }

        //quito 3 unidades y actualizo el producto de la lista
        for(Producto producto : productos){
            if(producto.getCodigo() == productoGuardado.getCodigo()){
                producto.setCantidadEnStock(producto.getCantidadEnStock() - 3);
                System.out.println("El articulo: " + producto.getNombre() + " tiene ahora: " + producto.getCantidadEnStock()
                        + " unidades");
            }
        }

    }
}
