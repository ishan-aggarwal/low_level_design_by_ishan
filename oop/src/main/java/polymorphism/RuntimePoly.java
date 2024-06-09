package polymorphism;

class A1 {
    void doSomething(String s) {
        System.out.println("Doing something in A");
    }
}

class B1 extends A1 {
    void doSomething(String s) {
        System.out.println("Doing something in B");
    }
}

public class RuntimePoly {

    public static void main(String[] args) {
        A1 a = new A1();
        a.doSomething("test parent"); //Method overriding

//        B1 b = (B1) new A1();
//
//        A1 a1 = new B1();
//        a1.doSomething("test child"); //Method overriding

    }
}

