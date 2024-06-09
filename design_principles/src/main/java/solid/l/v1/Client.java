package solid.l.v1;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        Flyable eagle1 = new Eagle();
        eagle1.fly();

        ((Bird) eagle1).eat();

        eagle.eat();
        ((Flyable) eagle).fly();

        penguin.eat();
    }
}

