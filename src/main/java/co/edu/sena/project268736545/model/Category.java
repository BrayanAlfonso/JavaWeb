package co.edu.sena.project268736545.model;

public class Category {
    private Integer id_category;
    private String name_category;

    public Category() {
    }

    public Category(Integer id_category, String name_category) {
        this.id_category = id_category;
        this.name_category = name_category;
    }

    public Category(String name_category) {
        this.name_category = name_category;
    }

    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", name_category='" + name_category + '\'' +
                '}';
    }
}
