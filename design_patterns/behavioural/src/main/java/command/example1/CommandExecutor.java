package command.example1;

public abstract class CommandExecutor {

    protected BankProvider bankProvider;

    public CommandExecutor(BankProvider bankProvider) {
        this.bankProvider = bankProvider;
    }

    public final String execute(Command command) {
        System.out.println("Executing command: " + command.getName());
        if (!isaValid(command)) {
            return "Invalid Command: " + command.getName();
        }
        return executeValidCommand(command);
    }
    public abstract boolean isApplicable(Command command);

    public abstract boolean isaValid(Command command);

    protected abstract String executeValidCommand(Command command);
}