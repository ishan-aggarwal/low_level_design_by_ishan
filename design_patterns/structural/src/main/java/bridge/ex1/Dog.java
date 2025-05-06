package bridge.ex1;

public class Dog extends LivingThings {
    private final Breath breath = new LandBreathImpl();

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
        this.breath.process();
    }
}
