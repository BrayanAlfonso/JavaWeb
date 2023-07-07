package co.edu.sena.project268736545.servlets;


import co.edu.sena.project268736545.repository.Repository;
import co.edu.sena.project268736545.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/registerUserServlet")
public class UserRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String user_name =request.getParameter("user_name");
    String user_last_name =request.getParameter("user_last_name");
    String user_email=request.getParameter("user_email");
    String user_password = request.getParameter("user_password");

        co.edu.sena.project2687365.model.User user= new co.edu.sena.project2687365.model.User(user_name,user_last_name,user_email,user_password);
        Repository<co.edu.sena.project2687365.model.User> repository = new UserRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String infoMessage = null;
        if (rows==0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Registro existoso");
        }
    }
}
