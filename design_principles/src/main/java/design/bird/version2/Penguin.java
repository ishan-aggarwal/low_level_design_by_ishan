package design.bird.version2;

public class Penguin extends Bird {

    // either have an empty implementation - this empty implementation is needed to reduce surprise for the client.
    //OR
    // throw some exception
    @Override
    public void fly() {

    }

    @Override
    public void makeSound() {
        System.out.println(this.getType() + "is sounding Ooooo.");
    }
}
