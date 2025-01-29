package com.antonio.controllers;

import com.antonio.entities.Persona;
import com.antonio.persistence.GenericJPA;

import java.util.List;
import java.util.Optional;

public class PersonaControllerGenerico {
    //aquí se encuentran los métodos que se encuentran en este controlador para gestionar a los empleados


    //aqui para genericos: hay que decirle que entidad va a ser procesada, en este caso
    GenericJPA GenericoJPA = new GenericJPA<>(Persona.class);


    public List<Persona> listarEmpleados() {
        return GenericoJPA.findAllGenerico();
    }

    public void agregarEmpleado(Persona persona) {
        GenericoJPA.createGenerico(persona);
    }

    public Optional buscarEmpleado(int empleadoBuscar) {
        return GenericoJPA.findOneGenerico(empleadoBuscar);
    }

    public void actualizarEmpleado(Persona persona){
        GenericoJPA.updateGenerico(persona);
    }

    public void eliminarEmpleado(int idEmpleadoEliminar){
        GenericoJPA.deleteGenerico(idEmpleadoEliminar);
    }

    /*  terminar
    public List<Empleado> buscarEmpleadoCargo(String cargo){
        return GenericoJPA.buscarEmpleadoCargo(cargo);
    }
     */
}
