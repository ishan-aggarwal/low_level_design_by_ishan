

// abstract method means a method which does not have a body

// so a abstract class can have both abstract method and non-abstract methods
// even if a class does not have any abstract method -> still we can mark
// the class abstract
// reverse is not trrue
// if there is a abstract method in the class -> it is mandatory to mark the class abstract

abstract class A {
    int sum() {
        return 2 + 3; // body of the method
    }

    abstract void sum1(); // this method does not have a body
    // so it is called abstract method
}

// from java 8 you can provide method body also in interfaces
// otherwise by default all the methods of an interface
// are abstract and public..
// so we don't add these two modifiers
interface B {
    void sum1();


    // we need to make the method as default in case you
    // want to add body for a method in interfaces
    default int sum() {
        return 2 + 3;
    }
}

class C implements B {

    @Override
    public void sum1() {

    }
}

public class Doubts {

    public static void main(String[] args) {
        B b = new C();
        System.out.println(b.sum());
    }

}
