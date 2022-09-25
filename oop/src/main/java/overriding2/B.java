package overriding2;

public class B extends A {

    // this is the default behavior that we get in child class if we dont override the doSomething method
//    void doSomething(String a) {
//        System.out.println("Doing something in parent");
//    }

    void doSomething(String a) {
        return;
    }

    public static void main(String[] args) {
        A a = new B();
        a.doSomething("test");

        a = new A();
        a.doSomething("test");
    }
}
