package org.example.warehouse;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class ProductRecord {
    private Object id;
    private final UUID uuid;
    private final String name;
    private final Category category;
    private BigDecimal price;

    public ProductRecord(UUID uuid, String name, Category category, BigDecimal price) {
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRecord that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(uuid, that.uuid) && Objects.equals(name, that.name) && Objects.equals(category, that.category) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, name, category, price);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public UUID uuid() {
        return uuid;
    }

    public BigDecimal price() {
        return price;
    }

    public Category category() {
        return category;
    }

    public Object getCategory() {
        return category();
    }
}
