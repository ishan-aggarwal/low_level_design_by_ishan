package com.ishan;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
//        Product productWithEligibleDiscount =
//                new ProductTypeDiscountPercentageCouponDecorator(
//                        new FlatDiscountPercentageCouponDecorator(product, 10), 3, product.getProductType());
//        this.products.add(productWithEligibleDiscount);

        Product productWithEligibleDiscount =
                new NextItemDiscountPercentageCouponDecorator(
                        new ProductTypeDiscountPercentageCouponDecorator(
                                new FlatDiscountPercentageCouponDecorator(product, 10),
                                3, product.getProductType()),
                        5, product.getProductType());
        this.products.add(productWithEligibleDiscount);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
