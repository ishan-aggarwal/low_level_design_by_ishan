package solid.l.v0;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.eat();
        penguin.eat();

        eagle.fly();
        penguin.fly();
    }
}

// Here - we can see that this is clear violation of Liskov Substitution Principle.
// The Client class is using the fly() method of the Bird class. But, the Penguin class is not implementing it and throwing an exception.
// Problem is that Penguin is not a Flyable, but it is a Bird.
// So, we need to create a new interface Flyable and make Eagle implement it. Then, we need to change the Client class to cast the eagle to Flyable.