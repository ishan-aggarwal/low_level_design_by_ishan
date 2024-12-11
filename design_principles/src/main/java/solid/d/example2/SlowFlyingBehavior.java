package solid.d.example2;

public class SlowFlyingBehavior implements IFlyingBehavior {
    @Override
    public void makeFly() {
        System.out.println("Slow flying behavior");
    }
}
