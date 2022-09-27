package adapter.example3.icici;

public class ICICIBankService {


    public double getAccountBalanceByAccountNumber(String accountNumber) {
        System.out.println("Account number: " + accountNumber);
        return 200000;
    }
}
