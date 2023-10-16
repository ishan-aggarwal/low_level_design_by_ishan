package command.example1;

public class DepositService extends CommandExecutor {
    public DepositService(BankProvider bankProvider) {
        super(bankProvider);
    }

    @Override
    public boolean isApplicable(Command command) {
        return CommandType.DEPOSIT == command.getName();
    }

    @Override
    public boolean isaValid(Command command) {
        return command.getParam().size() == 2;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParam().get(0);
        Integer amountToBeAdded = Integer.parseInt(command.getParam().get(1));

        if (amountToBeAdded < 0) {
            return "You can not deposit negative amount";
        }
        bankProvider.deposit(user, amountToBeAdded);
        return "Deposit done";
    }
}