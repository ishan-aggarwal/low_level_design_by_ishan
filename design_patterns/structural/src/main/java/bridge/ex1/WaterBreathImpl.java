package bridge.ex1;

public class WaterBreathImpl implements Breath {

    @Override
    public void process() {
        System.out.println("Breathing inside water");
    }
}
