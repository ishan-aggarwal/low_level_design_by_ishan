package polymorphism;

import java.util.Random;

public class Client {

    public static A getSomething() {
        Random random = new Random();
        int a = random.nextInt();

        if (a % 2 == 0) {
            return new B();
        } else {
            return new C();
        }
    }

    public static void main(String[] args) {
        A a = getSomething();
        a.age = 35;
        a.name = "Ishan";

        ((C) a).companyName = "Google"; // ERROR
        // If reference a holds an object of class B then it will result in class cast exception
//        Exception in thread "main" java.lang.ClassCastException: class polymorphism.B cannot be cast to class polymorphism.C (polymorphism.B and polymorphism.C are in unnamed module of loader 'app')
//        at polymorphism.Client.main(Client.java:23)


    }
}
