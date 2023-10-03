package org.example.warehouse;

import java.math.BigDecimal;
import java.util.*;

public class Warehouse {
    private Warehouse(List<String> getChangedProducts, List<String> getProductsGroupedByCategories) {
        this.getChangedProducts = getChangedProducts;
        this.getProductsGroupedByCategories = getProductsGroupedByCategories;
    }

    public static Warehouse getInstance(String myStore) {
        return null;
    }
    public static Warehouse getInstance(){
        return null;
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
        ProductRecord[] products = new ProductRecord[0];
        for (ProductRecord product : products) {
            if (product.getId().equals(uuid)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
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
