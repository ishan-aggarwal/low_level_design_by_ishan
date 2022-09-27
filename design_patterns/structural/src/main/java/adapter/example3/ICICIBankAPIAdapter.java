package adapter.example3;

import adapter.example3.icici.ICICIBankService;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private final ICICIBankService iciciBankService;

    public ICICIBankAPIAdapter() {
        this.iciciBankService = new ICICIBankService();
    }

    @Override
    public double getBalance(String accountNumber) {
        return iciciBankService.getAccountBalanceByAccountNumber(accountNumber);
    }
}
