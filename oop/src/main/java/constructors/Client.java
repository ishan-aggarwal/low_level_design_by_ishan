package constructors;

public class Client {

    public static void main(String[] args) {
        Student st = new Student("Ishan", "PU");
        System.out.println("DEBUG");
        Student st2 = new Student("Student2");
//        Student st1 = new Student();

        Student st3 = new Student(st2);
        st3.name = "Aman";

//        Student st4 = st3;
        System.out.println("DEBUG");
    }
}
