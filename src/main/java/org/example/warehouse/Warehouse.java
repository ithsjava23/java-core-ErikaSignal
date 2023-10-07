package org.example.warehouse;

import java.math.BigDecimal;
import java.util.*;

public class Warehouse {
    private String myStore;

    private Warehouse() {}

    private Warehouse(String myStore) {
        this.myStore = myStore;
    }

    public static Warehouse getInstance(String myStore) {
        return new Warehouse(myStore);
    }

    public static Warehouse getInstance(){
        return new Warehouse();
    }
    public String getName() {
        return myStore;
    }

    public boolean isEmpty() {
        return getProducts().isEmpty();
    }

    private final List<ProductRecord> products = new ArrayList<>();

    public List<ProductRecord> getProducts() {
        return products;
    }

    public ProductRecord addProduct(UUID uuid, String name, Category category, BigDecimal price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name can't be null or empty.");
        }

        ProductRecord product = new ProductRecord(uuid, name, category, price);
        products.add(product);
        return product;
    }

    public Optional<ProductRecord> getProductById(UUID uuid) {
        return Optional.empty();
    }

    public void updateProductPrice(UUID uuid, BigDecimal price) {

    }

    public List<ProductRecord> getChangedProducts = new ArrayList<>();

    public List<ProductRecord> getProductsGroupedByCategories = new ArrayList<>();

    public List<ProductRecord> getProductsBy(Category category) {
        return null;
    }

    public List<ProductRecord> getChangedProducts() {
        return null;
    }

    public Map<Category, List<ProductRecord>> getProductsGroupedByCategories() {
        return null;
    }
}
