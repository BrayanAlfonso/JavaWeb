<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>

<%@ include file="head1.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="../errorpage.jsp" %>
  <meta name="description" content="Pagina para registrar usuario completa y terminada Taller 2.">
  <meta name="keywords" content="Registro usuario">
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

      <form action="registerUserServlet" method="post">
        <img src="img/logo.PNG" alt="BrTechnology">
        <h4 class="text-secondary">BrTechnology</h4>
        <h1 class="h5 mb-3 fw-normal">Registro de usuario</h1>
        <div class="form-floating">
          <input type="text" class="form-control" id="floatingInput" id="user_name" name="user_name" placeholder="Ingrese sus nombres" required autofocus pattern="[A-Z a-z]{2,40}">
          <label for="user_name">Nombres:</label>
        </div>

        <div class="form-floating">

          <input type="text" class="form-control" id="user_last_name" name="user_last_name" placeholder="Ingrese sus apellidos" required pattern="[A-Z a-z]{2,40}">
          <label for="user_last_name">Apellidos:</label>
        </div>

        <div class="form-floating">

          <input type="email" class="form-control"  id="user_email" name="user_email" placeholder="Ingrese su correo" required pattern="{60}">
          <label for="user_email">Correo:</label>
        </div>

        <div class="form-floating">

          <input type="password" class="form-control"  id="user_password" name="user_password" placeholder="Ingrese su contraseña" required pattern=
                  ^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$><br><br>
          <label for="user_password">Contraseña:</label>
        </div>

        <button class="btn btn-primary" type="submit" >Enviar</button>


      </form>
    </main>
  </section>
<%@ include file="footer.jsp"%>


