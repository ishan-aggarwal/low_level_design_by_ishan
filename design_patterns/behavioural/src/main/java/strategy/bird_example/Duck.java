package strategy.bird_example;

import strategy.bird_example.display.DisplayBehavior;
import strategy.bird_example.fly.FlyBehavior;
import strategy.bird_example.quack.QuackBehavior;

public class Duck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;
    private final DisplayBehavior displayBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, DisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void flyDuck() {
        this.flyBehavior.fly();
    }

    public void quackDuck() {
        this.quackBehavior.quack();
    }

    public void displayDuck() {
        this.displayBehavior.display();
    }

}
