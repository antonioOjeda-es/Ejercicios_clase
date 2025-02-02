package com.example.menus.Responses;

import com.example.menus.entities.Pedido;

public class RespuestaPedido {

    String mensaje;
    Integer estado;
    String metodo;
    Pedido pedido;

    public RespuestaPedido(String mensaje, Integer estado, String metodo) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.metodo = metodo;
    }

    public RespuestaPedido(String mensaje, Integer estado, String metodo, Pedido pedido) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.metodo = metodo;
        this.pedido = pedido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "RespuestaPedido{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                ", metodo='" + metodo + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
