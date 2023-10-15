package strategy.bird_example.fly;

public class JetFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Duck flying in Jet fly way.");
    }
}
