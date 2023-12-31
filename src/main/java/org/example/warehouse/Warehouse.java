package org.example.warehouse;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

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
    private final List<ProductRecord> changedProducts = new ArrayList<>();

    public List<ProductRecord> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public List<ProductRecord> getChangedProducts() {
        return new ArrayList<>(changedProducts);
    }

    public List<ProductRecord> getProductsBy(Category category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public Map<Category, List<ProductRecord>> getProductsGroupedByCategories() {
        Map<Category, List<ProductRecord>> groupedProducts = new HashMap<>();
        products.forEach(product -> {
            Category category = (Category) product.getCategory();
            groupedProducts.computeIfAbsent(category, k -> new ArrayList<>()).add(product);
        });
        return groupedProducts;
    }

    public ProductRecord addProduct(UUID uuid, String name, Category category, BigDecimal price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name can't be null or empty.");
        }
        if (category == null) {
            throw new IllegalArgumentException("Category can't be null.");
        }
        if (price == null) {
            price = BigDecimal.ZERO;
        }
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        if (getProductById(uuid).isPresent()) {
            throw new IllegalArgumentException("Product with that id already exists, use updateProduct for updates.");
        }
        ProductRecord product = new ProductRecord(uuid, name, category, price);
        products.add(product);
        return product;
    }

    public Optional<ProductRecord> getProductById(UUID uuid) {
        return products.stream()
                .filter(product -> product.getUuid().equals(uuid))
                .findFirst();
    }

    public void updateProductPrice(UUID uuid, BigDecimal newPrice) {
        Optional<ProductRecord> optionalProduct = getProductById(uuid);
        if (optionalProduct.isPresent()) {
            ProductRecord product = optionalProduct.get();
            product.setPrice(newPrice);
            changedProducts.add(product);
        } else {
            throw new IllegalArgumentException("Product with that id doesn't exist.");
        }
    }
}
