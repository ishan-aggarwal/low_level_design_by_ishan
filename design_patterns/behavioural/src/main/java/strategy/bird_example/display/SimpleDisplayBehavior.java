package strategy.bird_example.display;

public class SimpleDisplayBehavior implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("Simple Duck");
    }
}
