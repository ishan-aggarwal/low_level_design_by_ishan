package solid.l.v1;

// Eagle is a bird and flyable also
// you can only do 1 extend
// but implements you can do multiple using , seprated
public class Eagle extends Bird implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}

