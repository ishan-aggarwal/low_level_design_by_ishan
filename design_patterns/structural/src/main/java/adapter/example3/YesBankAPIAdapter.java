package adapter.example3;

import adapter.example3.yesbank.YesBankService;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private final YesBankService yesBankService;

    public YesBankAPIAdapter() {
        this.yesBankService = new YesBankService();
    }


    @Override
    public double getBalance(String accountNumber) {
        return yesBankService.getAccountBalanceByAccountNumber(accountNumber);
    }
}
