package design.bird.version3;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println(this.getType() + "is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getType() + "is sounding Chichi.");
    }
}
