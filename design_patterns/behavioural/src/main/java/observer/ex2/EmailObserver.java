package observer.ex2;

public class EmailObserver extends Observer {

    private String email;

    public EmailObserver(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email sent to user " + getName() + " at " + email);
    }
}
