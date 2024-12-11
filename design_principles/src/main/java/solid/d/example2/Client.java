package solid.d.example2;

public class Client {
    public static void main(String[] args) {
        IFlyingBehavior flyingBehavior = new SlowFlyingBehavior();
        Crow crow = new Crow(flyingBehavior);
        crow.fly();

        IFlyingBehavior flyingBehavior1 = new FastFlyingBehavior();
        Crow crow1 = new Crow(flyingBehavior1);
        crow1.fly();
        // OCP, DI
        // SRP
        IFlyingBehavior flyingBehavior2 = new MediumFlyingBehavior();
        Crow crow2 = new Crow(flyingBehavior2);
        crow2.fly();
    }
}
