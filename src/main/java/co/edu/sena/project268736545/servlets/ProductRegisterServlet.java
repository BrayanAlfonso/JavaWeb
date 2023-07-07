package co.edu.sena.project268736545.servlets;

import co.edu.sena.project268736545.model.Product;
import co.edu.sena.project268736545.repository.ProductRegisterImpl;
import co.edu.sena.project268736545.repository.Repository;
import co.edu.sena.project268736545.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registerProduct")


public class ProductRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // para hacer seguimiento de todos los datos (collect all from data)
        String name_product = request.getParameter("name_product");
        float value_product = Float.parseFloat(request.getParameter("value_product"));
        Integer id_category = Integer.valueOf(request.getParameter("id_category"));


        // fill it up in a User bean
        Product product =new Product(name_product, value_product, id_category);


        // llamar la capa repositorio y guardar los datos o el objeto en la base de datos(call repository layer and save the user object to DB)
        Repository<Product> repository = new ProductRegisterImpl();
        int rows = 0;
        try {
            rows = repository.saveObj(product);
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
