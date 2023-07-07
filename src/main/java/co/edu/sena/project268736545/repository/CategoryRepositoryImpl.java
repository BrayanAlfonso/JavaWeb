package co.edu.sena.project268736545.repository;

import co.edu.sena.project268736545.ConnectionPool;
import co.edu.sena.project268736545.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements Repository<Category> {
    private String sql=null;

    @Override
    public List<Category> listAllObj() throws SQLException {
        sql = "select c.id_category, c.name_category "+
        "from Category c order by c.name_category ";
        List<Category> categories = new ArrayList<>();
        try(Connection conn = ConnectionPool.getConnection();
            Statement stmt =conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql)){
            while (rs.next()){
                Category c =createObj(rs);
                categories.add(c);
            }
        }
        return categories;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        sql = "select c.id_category, c.name_category "+
                "from category c where c.id_category = ?";
        Category category = null;

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try (ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    category = createObj(rs);
                }
            }
        }
        return category;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        int rowsAffected = 0;

        if (category.getId_category() != null && category.getId_category() > 0){
            sql = "update category c set c.name_category = ? " +
                    "where id_category = ? ";
        }else{
            sql = "insert into category (name_category)"+
                    "values(upper(?)) ";
        }

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps =conn.prepareStatement(sql)){
            ps.setString(1, category.getName_category());

            if (category.getId_category() != null && category.getId_category() > 0) {
                ps.setInt(2, category.getId_category());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from category where id_category = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }
    }

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId_category(rs.getInt("id_category"));
        category.setName_category(rs.getString("name_category"));



        return category;
    }
}
