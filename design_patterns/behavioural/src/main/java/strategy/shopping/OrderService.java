package strategy.shopping;

public class OrderService {

    private final CartService cartService;

    private final PaymentService paymentService;

    public OrderService(CartService cartService, PaymentService paymentService) {
        this.cartService = cartService;
        this.paymentService = paymentService;
    }

    public void createOrder() {
        double amount = 0;
        for (Item item : cartService.getItemList()) {
            amount += item.getPrice();
        }
        System.out.println("Items selected " + cartService.getItemNames() + " and Total amount to be paid: " + amount);
        boolean payStatus = paymentService.pay(amount);
        if (payStatus) {
            System.out.println("Payment successful & order created");
        } else {
            System.out.println("Payment failed & order not created");
        }
    }

}
