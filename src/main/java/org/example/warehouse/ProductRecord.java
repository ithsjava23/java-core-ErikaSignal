package org.example.warehouse;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductRecord {
    private UUID uuid;
    private String name;
    private Category category;
    private BigDecimal price;
    private Object id;

    public UUID uuid() {
        return null;
    }

    public Object price() {
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
}
