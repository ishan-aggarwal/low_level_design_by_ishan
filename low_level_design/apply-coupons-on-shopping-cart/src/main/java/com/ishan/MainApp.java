package com.ishan;

public class MainApp {

    public static void main(String[] args) {
        Product item1 = new Product1("lights", 1000, ProductType.DECORATIVE_GOODS);
        Product item2 = new Product2("sofa", 2000, ProductType.FURNITURE_GOODS);
        Product item3 = new Product1("fancy-lights", 1200, ProductType.DECORATIVE_GOODS);
        Product item4 = new Product1("basic-android-phone", 10000, ProductType.ELECTRONIC_GOODS);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(item1);
        shoppingCart.addProductToCart(item2);
        shoppingCart.addProductToCart(item3);
        shoppingCart.addProductToCart(item4);

        System.out.println("Total price: " + shoppingCart.getTotalPrice());
    }
}
