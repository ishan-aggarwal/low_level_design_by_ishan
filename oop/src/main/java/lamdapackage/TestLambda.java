package lamdapackage;

@FunctionalInterface
interface A {
    void print(int a);
}

public class TestLambda {

    public static void main(String[] args) {
        A object = x -> {
            System.out.println("Value of x: " + x);
        };

        object.print(4);
    }
}
