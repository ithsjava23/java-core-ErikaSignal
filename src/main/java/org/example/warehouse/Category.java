package org.example.warehouse;

public class Category {
    private Category() {
    }

    public static Category of(String name) {
        Category category = new Category();
        return new Category();
    }

    public Category getName() {
        Category name = new Category();
        if(name == null) throw new IllegalArgumentException();
        else return name;
    }
}
