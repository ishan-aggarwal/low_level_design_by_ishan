package command.example2;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private AirConditioner airConditioner;
    private final List<ACCommand> commandList;

    public Remote() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(ACCommand command) {
        commandList.add(command);
    }

    public void connectToAirConditioner(AirConditioner ac) {
        this.airConditioner = ac;
    }

    public void pressButton(ACCommand command) {

        System.out.println("Button pressed: " + command.getName());

        if (!commandList.contains(command)) {
            System.out.println("Not a valid command" + command.getName());
            return;
        }
        if (airConditioner == null) {
            System.out.println("Please connect to air conditioner");
            return;
        }
        command.execute(airConditioner);
    }
}
