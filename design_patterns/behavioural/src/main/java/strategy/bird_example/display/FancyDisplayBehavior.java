package strategy.bird_example.display;

public class FancyDisplayBehavior implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("Fancy Duck");
    }
}
