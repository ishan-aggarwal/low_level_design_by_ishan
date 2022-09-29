package strategy.quack;

public class SimpleQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Simple quack from duck");
    }
}
