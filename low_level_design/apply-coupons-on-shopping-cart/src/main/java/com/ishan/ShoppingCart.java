package com.ishan;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        Product productWithEligibleDiscount =
                new TypeCouponDecorator(
                        new PercentageCouponDecorator(product, 10), 3, product.getProductType());
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
