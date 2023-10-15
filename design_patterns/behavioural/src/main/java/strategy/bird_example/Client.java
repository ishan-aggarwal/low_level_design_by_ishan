package strategy.bird_example;

import strategy.bird_example.display.DisplayBehavior;
import strategy.bird_example.display.FancyDisplayBehavior;
import strategy.bird_example.display.SimpleDisplayBehavior;
import strategy.bird_example.fly.FlyBehavior;
import strategy.bird_example.fly.JetFlyBehavior;
import strategy.bird_example.fly.SimpleFlyBehavior;
import strategy.bird_example.quack.LoudQuackBehavior;
import strategy.bird_example.quack.QuackBehavior;
import strategy.bird_example.quack.SimpleQuackBehavior;

// Note: here we have family of algorithms for various different behaviors
// Each algorithm encapsulates the complete algorithm (in form of display(), fly() and quack() methods
// Each of the algorithms can be used interchangeably.
// Also, how the algorithm is injected into the Duck class and can help us to create different duck configurations.
// Client instantiates the different behaviors and creates duck instances out of it.
// This approach allows us to share the behavior horizontally whereas with the hierarchical structure it is not possible to share the behavior horizontally.
// we can only pass the behavior vertically.

public class Client {

    public static void main(String[] args) {

        FlyBehavior flyBehavior;
        DisplayBehavior displayBehavior;
        QuackBehavior quackBehavior;

        flyBehavior = new JetFlyBehavior();
        displayBehavior = new SimpleDisplayBehavior();
        quackBehavior = new LoudQuackBehavior();

        System.out.println("******* Mountain duck configuration *******");
        Duck mountainDuck = new Duck(flyBehavior, quackBehavior, displayBehavior);
        execute(mountainDuck);

        flyBehavior = new SimpleFlyBehavior();
        displayBehavior = new SimpleDisplayBehavior();
        quackBehavior = new SimpleQuackBehavior();

        System.out.println("******* City duck configuration *******");
        Duck cityDuck = new Duck(flyBehavior, quackBehavior, displayBehavior);
        execute(cityDuck);

        flyBehavior = new JetFlyBehavior();
        displayBehavior = new FancyDisplayBehavior();
        quackBehavior = new LoudQuackBehavior();

        System.out.println("******* Wild duck configuration *******");
        Duck wildDuck = new Duck(flyBehavior, quackBehavior, displayBehavior);
        execute(wildDuck);
    }

    public static void execute(Duck duck) {
        duck.flyDuck();
        duck.quackDuck();
        duck.displayDuck();
    }
}
