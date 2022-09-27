package adapter.example3;

public class PhonePeClient {

    public static void main(String[] args) {

        BankAPIAdapter bankAPIAdapter = new YesBankAPIAdapter();
        double balance = doSomething(bankAPIAdapter);
        System.out.println(balance);
    }

    public static double doSomething(BankAPIAdapter bankAPIAdapter) {
        double balance = bankAPIAdapter.getBalance("account-num");
        try {
//            Thread.sleep(25 * 24 * 60 * 60 * 1000);
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return balance * 2;
    }
}
