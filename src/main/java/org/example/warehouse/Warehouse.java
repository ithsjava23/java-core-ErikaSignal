package org.example.warehouse;

import java.math.BigDecimal;
import java.util.*;

public class Warehouse {
    private String myStore;
    private Warehouse() {
        this.getChangedProducts = getChangedProducts;
        this.getProductsGroupedByCategories = getProductsGroupedByCategories;
    }

    private Warehouse(String myStore) {
        this.myStore = myStore;
    }

    public static Warehouse getInstance(String myStore) {
        return new Warehouse(myStore);
    }

    public static Warehouse getInstance(){
        Warehouse createWarehouse = new Warehouse();
        return createWarehouse;
    }
    public String getName() {
        return myStore;
    }

    public boolean isEmpty() {
        return getProducts().isEmpty();
    }

    public List<ProductRecord> getProducts() {
        List<ProductRecord> addedProduct = new ArrayList<>();
        return null;
    }

    public ProductRecord addProduct(UUID uuidMilk, String milk, Category dairy, BigDecimal bigDecimal) {
        return null;
    }

    public Optional<ProductRecord> getProductById(UUID uuid) {
        return null;
    }

    public void updateProductPrice(UUID uuid, BigDecimal bigDecimal) {
    }

    public List<String> getChangedProducts = new ArrayList<>() {
    };

    public List<String> getProductsGroupedByCategories = new ArrayList<>() {
    };

    public List<ProductRecord> getProductsBy(Category meat) {
        return null;
    }

    public List<ProductRecord> getChangedProducts() {
        return null;
    }

    public Map<Category, List<ProductRecord>> getProductsGroupedByCategories() {
        return null;
    }
}
