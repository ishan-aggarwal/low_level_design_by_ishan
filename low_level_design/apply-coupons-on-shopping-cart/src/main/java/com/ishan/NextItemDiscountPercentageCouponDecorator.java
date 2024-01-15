package com.ishan;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NextItemDiscountPercentageCouponDecorator extends CouponDecorator {

    Product product;
    double discountPercentage;

    ProductType productType;

    static Set<ProductType> productTypesAddedToCard = new HashSet<>();

    public NextItemDiscountPercentageCouponDecorator(Product product, double discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public double getPrice() {

        double originalProductPrice = product.getPrice();
        if (productTypesAddedToCard.contains(productType)) {
            double discount = (originalProductPrice * discountPercentage) / 100;
            originalProductPrice = originalProductPrice - discount;
        }
        productTypesAddedToCard.add(productType);
        return originalProductPrice;
    }
}
