<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ include file="head1.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="../errorpage.jsp" %>
    <meta name="description" content="Pagina para registrar producto completa y terminada.">
    <meta name="keywords" content="Registro producto">
    <title>Registro de productos BrTechnology</title>
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

            <form action="registerProduct" method="post">
                <img src="img/logo.PNG" alt="BrTechnology">
                <h4 class="text-secondary">BrTechnology</h4>
                <h1 class="h5 mb-3 fw-normal">Registro de productos</h1>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" id="name_product" name="name_product" placeholder="Ingrese el nombre del producto" required autofocus pattern="[A-Z a-z]{2,40}">
                    <label for="name_product">Nombre del producto:</label>
                </div>

                <div class="form-floating">

                    <input type="text" class="form-control" id="value_product" name="value_product" placeholder="Ingrese el valor del producto" required >
                    <label for="value_product">Valor del producto:</label>
                </div>

                <div class="form-floating">

                    <input type="number" class="form-control"  id="id_category" name="id_category" placeholder="Ingrese lqa categoria del producto" required pattern="[A-Za-z]{2,40}">
                    <label for="id_category">Categoria:</label>
                </div>


                <button class="btn btn-primary" type="submit" >Enviar</button>


            </form>
        </main>
    </section>
    <%@ include file="footer.jsp"%>

