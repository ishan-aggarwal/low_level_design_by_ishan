package com.ishan;

public class FlatDiscountPercentageCouponDecorator extends CouponDecorator {

    Product product;
    double discountPercentage;

    public FlatDiscountPercentageCouponDecorator(Product product, double discountPercentage) {
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
