package introtooop;

public class Main {

    public static void main(String[] args) {
        // int a = 2;
        // [DataType] [nameOfVariable] = [valueOfVariable]

        Student ishan = new Student();
        ishan.name = "Ishan";
        ishan.age = 35;

        Student dinesh = new Student();
        dinesh.name = "Dinesh";
        dinesh.age = 19;

        System.out.println(dinesh.name);
        System.out.println(dinesh.age);
    }
}
