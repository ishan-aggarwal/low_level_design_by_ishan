package command.example2;

public class CommandClientApp2 {
    public static void main(String[] args) {

        TurnOnACCommand turnOnACCommand = new TurnOnACCommand();
        TurnOffACCommand turnOffACCommand = new TurnOffACCommand();

        AirConditioner ac = new AirConditioner();
        Remote remote = new Remote();

        ac.setRemote(remote);
        remote.connectToAirConditioner(ac);

        remote.addCommand(turnOnACCommand);
        remote.addCommand(turnOffACCommand);

        remote.pressButton(turnOnACCommand);
    }
}
