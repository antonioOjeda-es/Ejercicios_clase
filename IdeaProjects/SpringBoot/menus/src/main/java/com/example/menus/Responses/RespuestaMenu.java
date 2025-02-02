package com.example.menus.Responses;

public class RespuestaMenu {

    String mensaje;
    Integer estado;
    String método;

    public RespuestaMenu(String mensaje, Integer estado, String método) {
        this.mensaje = mensaje;
        this.estado = estado;
        this.método = método;
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

    public String getMétodo() {
        return método;
    }

    public void setMétodo(String método) {
        this.método = método;
    }

    @Override
    public String toString() {
        return "RespuestaPersona{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                ", método='" + método + '\'' +
                '}';
    }
}
