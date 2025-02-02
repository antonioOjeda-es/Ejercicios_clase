package com.jackaboss.ejercicioEventosAcademicos.Responses;

import com.jackaboss.ejercicioEventosAcademicos.entities.EventosAcademicos;

public class ResponseEventos {

    String mensaje;
    Integer estado;
    String metodo;
    EventosAcademicos eventosAcademicos;

    public ResponseEventos(String mensaje, Integer estado, String metodo) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.metodo = metodo;
    }

    public ResponseEventos(String mensaje, Integer estado, String metodo, EventosAcademicos pedido) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.metodo = metodo;
        this.eventosAcademicos = pedido;
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

    public EventosAcademicos getEventosAcademicos() {
        return eventosAcademicos;
    }

    public void setEventosAcademicos(EventosAcademicos eventosAcademicos) {
        this.eventosAcademicos = eventosAcademicos;
    }

    @Override
    public String toString() {
        return "RespuestaPedido{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                ", metodo='" + metodo + '\'' +
                ", eventosAcadémicos=" + eventosAcademicos +
                '}';
    }
}
