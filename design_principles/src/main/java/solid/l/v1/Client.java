package solid.l.v1;

public class Client {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.eat();
        ((Flyable) eagle).fly();

        penguin.eat();
    }
}

