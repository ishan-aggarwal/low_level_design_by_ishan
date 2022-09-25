package accessModifiersCheck;

import accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Ishan";
//        student.batchId = 1234;
//        student.psp = 91.0;
        student.universityName = "ABCD";
    }
}
