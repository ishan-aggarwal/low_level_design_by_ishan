package strategy.quack;

public class LoudQuackBehavior implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("Loud quack from duck.");
    }
}
