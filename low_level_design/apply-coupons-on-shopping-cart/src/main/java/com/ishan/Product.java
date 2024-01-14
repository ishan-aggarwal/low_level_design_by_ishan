package com.ishan;

public abstract class Product {

    private String name;
    double originalPrice;
    private ProductType productType;

    public Product() {
    }

    public Product(String name, double originalPrice, ProductType productType) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public ProductType getProductType() {
        return productType;
    }
}
