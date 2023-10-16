package command.example1;

import java.util.ArrayList;
import java.util.List;

public class CommandExampleMainApp {

    public static void main(String[] args) {

        DatabaseService database = new DatabaseService();
        BankProvider bankProvider = new BankProvider(database);

        CommandExecutor commandExecutor = new DepositService(bankProvider);
        CommandExecutor commandExecutor1 = new WithdrawalService(bankProvider);
        CommandExecutor commandExecutor2 = new BalanceEnquiryService(bankProvider);

        List<String> depositParams = new ArrayList<>();
        depositParams.add("user1");
        depositParams.add("100");

        List<String> withdrawalParams = new ArrayList<>();
        withdrawalParams.add("user1");
        withdrawalParams.add("50");

        List<String> balanceEnquiryParams = new ArrayList<>();
        balanceEnquiryParams.add("user1");

        Command command = new Command(CommandType.DEPOSIT, depositParams);
        Command command1 = new Command(CommandType.WITHDRAW, withdrawalParams);
        Command command2 = new Command(CommandType.CHECK_BALANCE, balanceEnquiryParams);

        CommandRunner commandRunner = new CommandRunner(List.of(commandExecutor, commandExecutor1, commandExecutor2));
        System.out.println(commandRunner.runCommand(command));
        System.out.println("-----------------------------");
        System.out.println(commandRunner.runCommand(command1));
        System.out.println("-----------------------------");
        System.out.println(commandRunner.runCommand(command2));
    }
}
