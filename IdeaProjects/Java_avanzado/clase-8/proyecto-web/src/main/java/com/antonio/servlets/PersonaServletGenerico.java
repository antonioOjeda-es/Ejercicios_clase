package com.antonio.servlets;

import com.antonio.controllers.PersonaController;
import com.antonio.entities.Persona;
import com.antonio.entities.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/persona")
public class PersonaServletGenerico extends HttpServlet {

    private PersonaController personaController = new PersonaController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> listaPersonas = personaController.listarTodas();

        listaPersonas.forEach(persona -> persona.getProductos().forEach(producto -> System.out.println(producto.getNombre())));

        /*enviear info al jsqp*/
        req.setAttribute("listado", listaPersonas);
        req.setAttribute("nombre", "Listado de personas");


        //req.getRequestDispatcher("persona.jsp").forward(req, resp);
        req.getRequestDispatcher("persona.jsp").forward(req, resp);
    }
}
