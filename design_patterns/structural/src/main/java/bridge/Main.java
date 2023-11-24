package bridge;

// difference between bridge and strategy pattern explained here:
// https://itecnote.com/tecnote/r-strategy-vs-bridge-patterns/

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish();
        fish.breath();

        LivingThings dog = new Dog();
        dog.breath();
    }
}
