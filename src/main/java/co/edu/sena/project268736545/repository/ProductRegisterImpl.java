package co.edu.sena.project268736545.repository;

import co.edu.sena.project268736545.ConnectionPool;
import co.edu.sena.project268736545.model.Category;
import co.edu.sena.project268736545.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRegisterImpl implements Repository<Product>{

    private String sql=null;
    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select p.id_product, p.name_product, p.value_product, p.id_category "+
                "from product p order by p.name_product ";
        List<Product> products = new ArrayList<>();
        try(Connection conn = ConnectionPool.getConnection();
            Statement stmt =conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql)){
            while (rs.next()){
                Product p =createObj(rs);
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "select p.id_product, p.name_product, p.value_product, p.id_category "+
                "from product p where p.id_product = ?";
        Product product = null;

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try (ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;

        if (product.getId_product() != null && product.getId_product() > 0){
            sql = "update product p set p.name_product = ?, p.value_product = ?, p.id_category = ? "+
                    "where id_product = ?";
        }else{
            sql = "insert into product (name_product, value_product, id_category)"+
                    "values(upper(?), ?, ?)";
        }

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps =conn.prepareStatement(sql)){
            ps.setString(1, product.getName_product());
            ps.setFloat(2, product.getValue_product());
            ps.setInt(3, product.getId_category());

            if (product.getId_product() != null && product.getId_product() > 0) {
                ps.setInt(4, product.getId_product());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from product where id_product = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps= conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }
    }

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId_product(rs.getInt("id_product"));
        product.setName_product(rs.getString("name_product"));
        product.setValue_product(rs.getFloat("value_product"));
        product.setId_category(rs.getInt("id_category"));


        return product;
    }
}
