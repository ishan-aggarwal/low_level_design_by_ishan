package bridge;

public class WaterBreathImpl implements Breath {

    @Override
    public void process() {
        System.out.println("Breathing inside water");
    }
}
