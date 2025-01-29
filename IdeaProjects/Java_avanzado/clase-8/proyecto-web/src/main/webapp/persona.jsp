<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Importar las clases -->
<%@ page import="java.util.List, com.antonio.entities.Persona, com.antonio.entities.Producto, com.antonio.entities.Tarjeta" %>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="partials/head.jsp" %>
<body>


    <!-- incluyo el heder de partials -->
    <%@ include file="partials/header.jsp" %>


    <h1>Personas Listado</h1>

    <!-- imprimir variables -->
    <p>Mensaje: <%= request.getAttribute("nombre") %></p>

<ul>
        <% List<Persona> listado = (List<Persona>) request.getAttribute("listado");


            for(Persona persona: listado) { %>

                <li>Persona: <%= persona.getNombre() %>, <%= persona.getApellido() %>, Productos:

                         <% for (Producto producto : persona.getProductos()) { %>
                                 <span class="tarjetas"> <%= producto.getNombre() %>, </span>
                         <% } %>

                         <% for (Tarjeta tarjeta : persona.getTarjetas()) { %>
                                 <span class="tarjetas"> <%= tarjeta.getTipo() %>, </span>
                         <% } %>
                </li>
            <% } %>

</ul>

    <!-- incluyo el scripts de bootstrap y local de partials -->
    <%@ include file="partials/scriptPieBody.jsp" %>


</body>
</html>
