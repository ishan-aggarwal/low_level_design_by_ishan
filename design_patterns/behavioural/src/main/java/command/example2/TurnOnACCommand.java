package command.example2;

public class TurnOnACCommand implements ACCommand {

    private final String name;

    public TurnOnACCommand() {
        this.name = "TurnOnAC";
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute(AirConditioner ac) {
        ac.turnOn();
    }
}
