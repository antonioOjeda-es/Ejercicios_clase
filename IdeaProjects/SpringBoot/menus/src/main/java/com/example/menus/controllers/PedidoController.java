package com.example.menus.controllers;


import com.example.menus.Responses.RespuestaPedido;
import com.example.menus.entities.Pedido;
import com.example.menus.utils.PedidoUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    //instancio la lista pedidos
    PedidoUtils pedidoUtils = new PedidoUtils();

    //agregar un pedido
    @GetMapping("")
    public RespuestaPedido agregarPedido(@RequestParam Long idMenu, @RequestParam String plato){

        //lanzo una respuesta cuando el plato esté agregado al pedido
        return pedidoUtils.agregarPedido(idMenu, plato);
    }

    //agregar plato a un pedido
    @GetMapping("/insertarPlato")
    public RespuestaPedido agregarPlato(@RequestParam Long idMenu, @RequestParam String plato){

        //lanzo una respuesta cuando el plato esté agregado al pedido
        return PedidoUtils.agregarPlato(idMenu, plato);
    }

    //agregar plato a un pedido
    @PostMapping("/agregar")
    public RespuestaPedido agregarPedidoPost(@RequestBody Pedido pedido){

        //lanzo una respuesta cuando el plato esté agregado al pedido
        return PedidoUtils.agregarPedidoPost(pedido);
    }

    //buscar un pedido
    @GetMapping("/{id}")
    public RespuestaPedido agregarPedido(@PathVariable("id") Long idPedido){

        //lanzo una respuesta tanto si encuentra el pedido como si no
        return pedidoUtils.BuscarPedido(idPedido);
    }


}
