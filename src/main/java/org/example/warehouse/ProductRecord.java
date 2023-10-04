package org.example.warehouse;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductRecord {
    private Object id;

    public ProductRecord(UUID uuid, String name, Category category, BigDecimal price) {
    }

    public static void add(ProductRecord products) {
    }

    public UUID uuid() {
        return null;
    }

    public BigDecimal price() {
        return null;
    }

    public Category category() {
        return null;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getCategory() {
        return category();
    }
}
