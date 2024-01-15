package com.ishan;

public class Product2 extends Product {
    public Product2(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
