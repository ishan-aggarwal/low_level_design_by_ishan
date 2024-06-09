package polymorphism;

public class CompileTimePoly {

    int doSomething() {
        System.out.println("Doing something 1");
        return 0;
    }

    String doSomething(int x) {
        System.out.println("Doing something 2");
        return "";
    }


    public static void main(String[] args) {
        CompileTimePoly obj = new CompileTimePoly();
        obj.doSomething();
        obj.doSomething(1);
    }
}
