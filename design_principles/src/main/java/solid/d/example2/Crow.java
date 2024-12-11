package solid.d.example2;

public class Crow {

    // this is called as constructor based dependency injection
    // where we are allowing to take the value of the data member
    // from outside.
    private IFlyingBehavior flyingBehavior;

    public Crow(IFlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void fly() {
        this.flyingBehavior.makeFly();
    }

}
