package co.edu.sena.project268736545.servlets;

import co.edu.sena.project268736545.model.Category;
import co.edu.sena.project268736545.repository.CategoryRepositoryImpl;
import co.edu.sena.project268736545.repository.Repository;
import co.edu.sena.project268736545.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registerCategory")
public class CategoryRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // para hacer seguimiento de todos los datos (collect all from data)
    String name_category = request.getParameter("name_category");


    // fill it up in a User bean
    Category category =new Category(name_category);


    // llamar la capa repositorio y guardar los datos o el objeto en la base de datos(call repository layer and save the user object to DB)
    Repository<Category> repository = new CategoryRepositoryImpl();
    int rows = 0;

        try {
            rows = repository.saveObj(category);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //Preparar respuesta al usuario (prepare an information message for user about success or failure of the operation)
    String infoMessage = null;
    // infoMessage = "Ocurrió un error!"
    if (rows == 0){
        System.out.print("Ocurrió un error!");
    }else{
        // infoMessage = "Registro exitoso!"
        System.out.print("Registro exitoso!");
    }

    //todo devolver mensaje a otra pagina (write the message back to the page in cliente browser)

}

}
