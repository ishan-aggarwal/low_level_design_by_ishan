package solid.l.v0;

// if you are extending or implemeting
// this is inheritance only -> IS-A relationship

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

