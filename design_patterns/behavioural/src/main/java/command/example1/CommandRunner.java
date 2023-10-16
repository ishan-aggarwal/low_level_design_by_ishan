package command.example1;

import java.util.List;

public class CommandRunner {

    private final List<CommandExecutor> executorList;

    public CommandRunner(List<CommandExecutor> executorList) {
        this.executorList = executorList;
    }

    public String runCommand(Command command) {
        for (CommandExecutor commandExecutor : executorList) {
            if (commandExecutor.isApplicable(command)) {
                return commandExecutor.execute(command);
            }
        }
        return "Invalid Command";
    }
}