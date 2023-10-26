package org.example.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Category {
    private final String name;

    private static final Map<String, Category> categoryCache = new HashMap<>();
    private Category(String name) {
        this.name = capitalizeFirstLetter(name);
    }

    public String getName(){
        return name;
    }

    public static Category of(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Category name can't be null");
        }

        if(categoryCache.containsKey(name))
            return categoryCache.get(name);

        Category category = new Category(name);
        categoryCache.put(name, category);
        return category;
    }

    private static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

}
