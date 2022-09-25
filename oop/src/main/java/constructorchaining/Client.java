package constructorchaining;

public class Client {

    public static void main(String[] args) {
        D d = new D(); // complete default constructor chaining starting from base class

        A a = new D(); // again complete default constructor chaining starting from base class

        D d1 = (D) new A();
//        Constructor of A
//        Exception in thread "main" java.lang.ClassCastException: class constructorchaining.A cannot be cast to class constructorchaining.D (constructorchaining.A and constructorchaining.D are in unnamed module of loader 'app')
//        at constructorchaining.Client.main(Client.java:10)

    }
}
