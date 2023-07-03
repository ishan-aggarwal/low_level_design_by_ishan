package bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathImpl());
        fish.breath();

        LivingThings dog = new Fish(new LandBreathImpl());
        dog.breath();
    }
}
