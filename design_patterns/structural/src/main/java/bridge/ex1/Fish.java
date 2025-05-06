package bridge.ex1;

public class Fish extends LivingThings {
    private final Breath breath = new WaterBreathImpl();

    @Override
    public void breath() {
        System.out.println("Fish is breathing");
        this.breath.process();
    }
}
