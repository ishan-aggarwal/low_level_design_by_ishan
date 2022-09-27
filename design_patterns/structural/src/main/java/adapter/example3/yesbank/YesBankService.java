package adapter.example3.yesbank;

public class YesBankService {

    public double getAccountBalanceByAccountNumber(String accountNumber) {
        System.out.println("Account number: " + accountNumber);
        return 100000;
    }
}
