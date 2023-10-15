package strategy.shopping;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean payMethod(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
        return true;
    }
}
