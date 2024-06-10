package genericspackage;

public class Pair<V, S> {
    V first;
    S second;

    public static <V, T, X> X doSome(V x, T y) {
        return null;
        //return null;
    }

    public <Prateek> void doSomething(Prateek x) {
        System.out.println("Doing something");
    }

    void setFirst(V first) {
        this.first = first;
    }

    S getSecond() {
        return this.second;
    }
}