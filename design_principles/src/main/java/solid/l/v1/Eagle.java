package solid.l.v1;

public class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}

