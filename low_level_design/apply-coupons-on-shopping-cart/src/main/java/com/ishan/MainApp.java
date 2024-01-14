package com.ishan;

public class MainApp {

    public static void main(String[] args) {
        Product item1 = new Item1("item1", 1000, ProductType.DECORATIVE_GOODS);
        Product item2 = new Item2("item2", 2000, ProductType.FURNITURE_GOODS);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductToCart(item1);
        shoppingCart.addProductToCart(item2);

        System.out.println("Total price: " + shoppingCart.getTotalPrice());
    }
}
