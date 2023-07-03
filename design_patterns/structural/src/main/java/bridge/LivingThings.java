package bridge;

public abstract class LivingThings {

    Breath breathImplementer;

    public LivingThings(Breath breathImplementer) {
        this.breathImplementer = breathImplementer;
    }

    public void breath() {
        this.breathImplementer.process();
    }
}
