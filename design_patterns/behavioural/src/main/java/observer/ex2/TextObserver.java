package observer.ex2;

public class TextObserver extends Observer {

    private String phoneNumber;

    public TextObserver(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Text sent to user " + getName() + " at " + phoneNumber);
    }
}
