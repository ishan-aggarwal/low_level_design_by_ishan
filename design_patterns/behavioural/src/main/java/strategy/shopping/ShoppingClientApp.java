package strategy.shopping;

public class ShoppingClientApp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new UPIPaymentStrategy());
        paymentService.pay(100.0);

        Item item1 = Item.builder().name("Item1").price(10.0).build();
        Item item2 = Item.builder().name("Item2").price(20.0).build();
        Item item3 = Item.builder().name("Item3").price(30.0).build();

        CartService cartService = new CartService();
        cartService.addItem(item1);
        cartService.addItem(item2);
        cartService.addItem(item3);

        paymentService = new PaymentService(new CreditCardPaymentStrategy());

        OrderService orderService = new OrderService(cartService, paymentService);
        orderService.createOrder();
    }
}
