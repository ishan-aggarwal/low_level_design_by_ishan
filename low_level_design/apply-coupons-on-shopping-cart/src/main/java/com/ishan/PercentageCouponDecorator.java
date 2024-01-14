package com.ishan;

public class PercentageCouponDecorator extends CouponDecorator {

    Product product;
    double discountPercentage;

    public PercentageCouponDecorator(Product product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double originalPrice = product.getPrice();
        double discount = (originalPrice * discountPercentage) / 100;
        return originalPrice - discount;
    }
}
