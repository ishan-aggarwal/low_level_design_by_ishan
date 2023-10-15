package strategy.bird_example.display;

public class LooksGoodDuckBehavior implements DisplayBehavior {

    @Override
    public void display() {
        System.out.println("Current duck looks good.");
    }
}
