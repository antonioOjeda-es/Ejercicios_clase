<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- cargamos los datos de head desde partials -->
    <%@ include file="partials/head.jsp" %>
</head>
<body>

    <!-- cargamos el header desde partials -->
    <%@ include file="partials/header.jsp" %>

    <!-- url para mandar y método post para mandar el formulario -->
    <!-- name para decir que va a enviar nombre del objeto persona -->
    <!-- name para decir que va a enviar apellido del objeto persona -->
<!--
    <form action="/proyecto-web/personaForm" method="post">
        <br><br>

        <input type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre" required >

        <br><br>
        <input type="text" name="apellido" id="apellido"  placeholder="Ingrese el apellido" required>

        <br><br>
        <button type="submit">Guardar Persona</button>

    </form>
-->

<!-- sacado de boostrap -->
 <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        <h4 class="mb-0">Agregar Nueva Persona</h4>
                    </div>
                    <div class="card-body">
                        <form id="personaForm" action="/proyecto-web/personaForm" method="post">
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" required>
                            </div>

                            <div class="mb-3">
                                <label for="apellido" class="form-label">Apellido</label>
                                <input type="text" class="form-control" id="apellido" name="apellido" required>
                            </div>

                            <div class="d-grid gap-2">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <a href="index.html" class="btn btn-secondary">Cancelar</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- incluyo el scripts de bootstrap y local de partials -->
    <%@ include file="partials/scriptPieBody.jsp" %>

</body>
</html>
