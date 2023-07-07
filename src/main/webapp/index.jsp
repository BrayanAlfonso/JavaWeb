<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>

<%@ include file="jsp/head1.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="errorpage.jsp" %>

    <meta name="description" content="Pagina para iniciar sesion completa y terminada Taller 2.">
    <meta name="keywords" content="Login usuario">
<%@ include file="jsp/head2.jsp"%>


    <title>Inicio de sesión BrTechnology</title>


<body class="text-center">
<div class="container">
    <header>

    </header>

    <nav>
        <a href="login">Login page</a>  |
        <a href="sena">SENA</a> | <a href="register">Registrarse</a> | <a href="category">Registrar Categoria</a> | <a href="product">Registrar Producto</a> | <a href="index">Index</a>
    </nav>

    <section>
        <main class="form-signin w-100 m-auto">

            <form action="" method="post">
                <img src="img/logo.PNG" alt="MY APP">
                <h4 class="text-secondary">BrTechnology</h4>
                <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="Ingrese su nombre de usuario" required autofocus pattern="[A-Z a-z0-9]{8, 12}">
                    <label for="floatingInput">Usuario:</label>
                </div>

                <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPassword" placeholder="Ingrese su nombre contraseña" required pattern="[A-Z a-z0-9]{8, 12}">
                    <label for="floatingPassword">Contraseña:</label>
                </div>
                <br>
                <button class="w-100 btn btn-lg btn-primary" type="submit">Ingresar</button>



            </form>
        </main>
    </section>
    <%@ include file="jsp/footer.jsp"%>

