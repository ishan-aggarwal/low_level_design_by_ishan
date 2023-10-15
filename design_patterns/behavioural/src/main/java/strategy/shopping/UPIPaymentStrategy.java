package strategy.shopping;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean payMethod(double amount) {
        System.out.println("Paid " + amount + " using UPI");
        return true;
    }
}
