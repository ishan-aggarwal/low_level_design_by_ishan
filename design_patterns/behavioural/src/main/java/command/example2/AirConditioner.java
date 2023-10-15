package command.example2;

public class AirConditioner {

    private Remote remote;

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public void turnOn() {
        System.out.println("Air conditioner turned on");
    }

    public void turnOff() {
        System.out.println("Air conditioner turned off");
    }
}
