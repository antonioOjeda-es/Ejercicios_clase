package com.example.menus.utils;

import com.example.menus.Responses.RespuestaPedido;
import com.example.menus.entities.Menu;
import com.example.menus.entities.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoUtils {

    //instancio la lista de menús
    static List<Menu> listaMenus = new MenuUtils().listarTodos();


    //inicio la variable de listaPedido para que al instanciarla, me cree una lista predefinida de pedidos
    static List<Pedido> listaPedidos = new ArrayList<>();


    public PedidoUtils() {


        Pedido pedido1 = new Pedido(1L);
        pedido1.addMenu(listaMenus.get(0)); // Agregar "Menú del día"
        pedido1.addMenu(listaMenus.get(1));
        pedido1.addPlato("Macarrones a la boloñesa");
        pedido1.addPlato("Huevos con patatas y salchichas");


        Pedido pedido2 = new Pedido(2L);
        pedido2.addMenu(listaMenus.get(2)); // Agregar "Menú degustación"
        pedido2.addPlato("Jamón asado");
        pedido2.addPlato("Huevos estrellados");

        Pedido pedido3 = new Pedido(3L);
        pedido3.addMenu(listaMenus.get(3)); // Agregar "Menú infantil"
        pedido3.addMenu(listaMenus.get(4)); // Agregar "Menú ejecutivo"
        pedido3.addPlato("Lasaña de verduras");
        pedido3.addPlato("Filetes empanados");

        // Agregar los pedidos a la lista de pedidos
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
    }

    //insertar plato
    public static RespuestaPedido agregarPlato(Long idMenu, String plato) {

        try {
            listaPedidos.stream()
                    .filter(m -> m.getId().equals(idMenu))
                    .findFirst()
                    .ifPresent(p -> p.addPlato(plato));

            //voy a imprimirlo en consola
            listaPedidos.stream()
                    .filter(m -> m.getId().equals(idMenu))
                    .findFirst()
                    .ifPresent(System.out::println);

            return new RespuestaPedido("Plato agregado correctamente al pedido", 201, "POST");

        } catch (Exception e) {
            return new RespuestaPedido("No se ha podido agregar el plato al pedido", 400, "POST");
        }
    }

    public RespuestaPedido agregarPedido(Long idMenu, String plato) {

        //lanzo el mensaje si todo ha salido bien
        try {
            //capturar el menú seleccionado por el id del menú
            Menu menuPedido = listaMenus.stream()
                    .filter(m -> m.getId().equals(idMenu))
                    .findFirst()
                    .orElse(null);

            //creo las listas, podría haberlas hecho en el constructor
            List<String> platos = new ArrayList<>();
            platos.add(plato);
            List<Menu> menus = new ArrayList<>();
            menus.add(menuPedido);

            listaPedidos.add(new Pedido(Long.valueOf(listaPedidos.size()) + 1, menus, platos));

            System.out.println(listaPedidos.get(listaPedidos.size() - 1));

            return new RespuestaPedido("pedido agregado correctamente", 201, "POST");

        } catch (Exception e) {
            return new RespuestaPedido("No se ha podido agregar el pedido", 400, "POST");
        }
    }

    public static RespuestaPedido agregarPedidoPost(Pedido pedido) {

        System.out.println(pedido);
        //lanzo el mensaje si todo ha salido bien
        try {

            // Capturar el menú seleccionado por el id del menú
            List<Menu> menusPedidos = listaMenus.stream()
                    .filter(m ->
                            pedido.getMenus().stream()
                                    .anyMatch(menu -> m.getId().equals(menu.getId()))
                    )
                    .toList();

            System.out.println(menusPedidos);

            //creo las listas, podría haberlas hecho en el constructor
            List<String> platos = new ArrayList<>();
            //agrego todos los platos
            pedido.getPlatos().forEach(p -> platos.add(p));
            List<Menu> menus = new ArrayList<>();

            //agrego cada menú a la lista
            menusPedidos.forEach(menu -> menus.add(menu));

            listaPedidos.add(new Pedido(Long.valueOf(listaPedidos.size() + 1), menus, platos));
            //lo imprimo por consola
            System.out.println(listaPedidos.get(listaPedidos.size() - 1));

            return new RespuestaPedido("pedido agregado correctamente", 201, "POST");

        } catch (Exception e) {
            return new RespuestaPedido("No se ha podido agregar el pedido", 400, "POST");
        }

    }

    public RespuestaPedido BuscarPedido(Long idPedido) {

        Pedido pedidoEncontrado = listaPedidos.stream()
                .filter(p -> p.getId().equals(idPedido))
                .findFirst()
                .orElse(null);

        //al devolver un null el optional, no sirve porner la respuesta en try/catch puesto que no lanza error
        if (pedidoEncontrado == null) {
            return new RespuestaPedido("No se ha podido encontrar el pedido", 400, "GET");
        }

        return new RespuestaPedido("pedido encontrado", 201, "POST", pedidoEncontrado);
    }
}
