package bridge.ex1;

public class LandBreathImpl implements Breath {

    @Override
    public void process() {
        System.out.println("Breathing on Land");
    }
}
