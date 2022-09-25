package design.bird.version1;

// Note: the problem with this approach is that
// different types of birds they all have the same behavior
// Also, there could be possibility that some birds don't fly.
public class Client {

    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.setName("White-sparrow");
        b1.setType("sparrow");

        Bird b2 = new Bird();
        b2.setName("Black-crow");
        b2.setType("crow");

        b1.fly();
        b2.fly();

        b1.makeSound();
        b2.makeSound();
    }

}
