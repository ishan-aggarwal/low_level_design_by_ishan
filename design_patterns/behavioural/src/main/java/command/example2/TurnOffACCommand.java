package command.example2;

public class TurnOffACCommand implements ACCommand {

    private final String name;

    public TurnOffACCommand() {
        this.name = "TurnOffAC";
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute(AirConditioner ac) {
        ac.turnOff();
    }
}

