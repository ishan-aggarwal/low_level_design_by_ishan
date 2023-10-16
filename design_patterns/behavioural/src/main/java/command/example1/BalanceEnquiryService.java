package command.example1;

public class BalanceEnquiryService extends CommandExecutor {

    public BalanceEnquiryService(BankProvider bankProvider) {
        super(bankProvider);
    }

    @Override
    public boolean isApplicable(Command command) {
        return command.getName() == CommandType.CHECK_BALANCE;
    }

    @Override
    public boolean isaValid(Command command) {
        return command.getParam().size() >= 1;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParam().get(0);
        return bankProvider.getUserBalance(user).toString();
    }
}