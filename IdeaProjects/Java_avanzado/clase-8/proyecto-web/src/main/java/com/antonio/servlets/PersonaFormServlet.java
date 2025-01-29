package com.antonio.servlets;

import com.antonio.controllers.PersonaController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/personaForm")
//siempre tiene que extender httpservlet
public class PersonaFormServlet extends HttpServlet {

    PersonaController personaController = new PersonaController();

    //para enviar el formulario
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("personaForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        //insertamos desde la clase genérico personaController
        personaController.create(nombre, apellido);

        //para redireccionar
        resp.sendRedirect( req.getContextPath() + "/persona");//getContextPath: para obtener la dirección (proyecto-web))

    }
}
