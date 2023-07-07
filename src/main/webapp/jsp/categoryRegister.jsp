<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>

<%@ include file="head1.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="../errorpage.jsp" %>
    <meta name="description" content="Pagina para registrar categoria completa y terminada.">
    <meta name="keywords" content="Registro categoria">
    <title>Registro de usuario BrTechnology</title>
<%@ include file="head2.jsp"%>

<body class="text-center">
<div class="container">
    <header class="text-center">

        <br/>
    </header>

    <nav>
        <a href="index">Index</a>
    </nav>

    <section class="text-center">

        <main class="form-signin w-100 m-auto">

            <form action="registerCategory" method="post">
                <img src="img/logo.PNG" alt="BrTechnology">
                <h4 class="text-secondary">BrTechnology</h4>
                <h1 class="h5 mb-3 fw-normal">Registro de categoria</h1>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" id="name_category" name="name_category" placeholder="Ingrese el nombre de la catogria" required autofocus pattern="[A-Z a-z 0-9]{2,40}">
                    <label for="name_category">Categoria:</label>
                </div>

                <button class="btn btn-primary" type="submit" >Enviar</button>


            </form>
        </main>
    </section>
    <%@ include file="footer.jsp"%>

