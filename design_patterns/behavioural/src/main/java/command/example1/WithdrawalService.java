package command.example1;

public class WithdrawalService extends CommandExecutor {
    public WithdrawalService(BankProvider bankProvider) {
        super(bankProvider);
    }

    @Override
    public boolean isApplicable(Command command) {
        return CommandType.WITHDRAW == command.getName();
    }

    @Override
    public boolean isaValid(Command command) {
        return command.getParam().size() == 2;
    }

    @Override
    protected String executeValidCommand(Command command) {
        String user = command.getParam().get(0);
        Integer amountToWithdraw = Integer.parseInt(command.getParam().get(1));

        Integer userBalance = bankProvider.getUserBalance(user);
        if (amountToWithdraw > userBalance) {
            return "You can not withdraw more than your balance";
        }
        bankProvider.withdraw(user, amountToWithdraw);
        return "Withdraw done successfully";
    }
}