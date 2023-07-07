package co.edu.sena.project268736545.repository;


import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<co.edu.sena.project2687365.model.User> repository = new UserRepositoryImpl();

        System.out.println("================== saveObj Insert=================");
        co.edu.sena.project2687365.model.User userInsert = new co.edu.sena.project2687365.model.User();

        userInsert.setUser_firstname("Carlos");
        userInsert.setUser_lastname("Rojas");
        userInsert.setUser_email("carlos@LoQueSea.com");
        userInsert.setUser_password("asdfg12345");
        repository.saveObj(userInsert);

        userInsert.setUser_firstname("pEpE");
        userInsert.setUser_lastname("perez");
        userInsert.setUser_email("PEPE@corre.com");
        userInsert.setUser_password("67890qwerty");
        repository.saveObj(userInsert);

        System.out.println("================== listAllObj==============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================== byIdObj==============");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("================== saveObj==============");
        co.edu.sena.project2687365.model.User userUpdate = new co.edu.sena.project2687365.model.User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("jorge");
        userUpdate.setUser_lastname("palacios");
        userUpdate.setUser_email("jorge@example.com");
        userInsert.setUser_password("12345asdfg");


        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================== deleteObj ==============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
}
}
