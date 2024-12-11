package solid.d.example2;

public class NewCrow {
    // when a class creates it's own data members
    // and does not allow us to supply the data members from outside
    // then it is not following depedency injection

    // tight coupling - so it is not following DI principal as well

    private IFlyingBehavior flyingBehavior = new FastFlyingBehavior();

    public void fly() {
        flyingBehavior.makeFly();
    }
}
