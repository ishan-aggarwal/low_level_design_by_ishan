package strategy.shopping;

public class PaymentService {

    private final PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean pay(double amount) {
        return this.paymentStrategy.payMethod(amount);
    }
}
