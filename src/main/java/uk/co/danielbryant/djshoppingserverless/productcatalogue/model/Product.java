package uk.co.danielbryant.djshoppingserverless.productcatalogue.model;


import java.math.BigDecimal;

public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public Product() {
        // Needed for Jackson deserialization
    }

    public Product(String id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
