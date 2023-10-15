package strategy.bird_example.fly;

public class SimpleFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Duck flying in simple way.");
    }
}
