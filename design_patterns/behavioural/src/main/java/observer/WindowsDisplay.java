package observer;

public class WindowsDisplay implements IDisplay {
    @Override
    public void display(String data) {
        System.out.println("Following update is received on windows display: " + data);
    }
}
