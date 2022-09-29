package observer;

public class PhoneDisplay implements IDisplay {
    @Override
    public void display(String data) {
        System.out.println("Following update is received on phone display: " + data);
    }
}
