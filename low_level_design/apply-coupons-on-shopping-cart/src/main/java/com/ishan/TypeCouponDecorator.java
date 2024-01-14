package com.ishan;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {

    Product product;
    double discountPercentage;

    ProductType productType;

    static List<ProductType> eligibleProductTypes = new ArrayList<>();

    static {
        eligibleProductTypes.add(ProductType.DECORATIVE_GOODS);
        eligibleProductTypes.add(ProductType.FURNITURE_GOODS);
    }

    public TypeCouponDecorator(Product product, double discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double originalPrice = product.getPrice();

        if (eligibleProductTypes.contains(productType)) {
            double discount = (originalPrice * discountPercentage) / 100;
            originalPrice = originalPrice - discount;
        }


        return originalPrice;
    }
}
