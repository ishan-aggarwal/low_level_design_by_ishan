package genericsbasics;

public class GenericsType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid

        String s = type.get();
        System.out.println(s);

        // Raw use of parameterized class 'GenericsType'
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10); //valid and autoboxing support

        Object o = type1.get();
        System.out.println((String) o);
    }
}
