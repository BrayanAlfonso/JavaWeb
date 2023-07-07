package co.edu.sena.project268736545.model;

public class Product {
    private Integer id_product;
    private String name_product;
    private Float value_product;
    private Integer id_category;

    public Product() {
    }

    public Product(Integer id_product, String name_product, Float value_product, Integer id_category) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.value_product = value_product;
        this.id_category = id_category;
    }

    public Product(String name_product, Float value_product, Integer id_category) {
        this.name_product = name_product;
        this.value_product = value_product;
        this.id_category = id_category;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public Float getValue_product() {
        return value_product;
    }

    public void setValue_product(Float value_product) {
        this.value_product = value_product;
    }

    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", name_product='" + name_product + '\'' +
                ", value_product=" + value_product +
                ", id_category=" + id_category +
                '}';
    }
}
