package bridge;

public class LandBreathImpl implements Breath {

    @Override
    public void process() {
        System.out.println("Breathing on Land");
    }
}
