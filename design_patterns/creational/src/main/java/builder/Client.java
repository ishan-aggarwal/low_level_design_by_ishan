package builder;

public class Client {

    public static void main(String[] args) {

        // Note: here we have not created the object of Student class yet
        // We have just created a helper object that will help in setting up the Student class Object
        Builder builder = new Builder();
        builder.setName("Ishan Aggarwal");
        builder.setAge(25);
        builder.setId(1l);
        builder.setPsp(89.0f);
        builder.setPhoneNumber("9654-6-0000");
        builder.setBatch("Oct-21batch");
        builder.setUniversityName("PU");
        builder.setGradYear(2023);

        // Here we are using the helper object to create the student object
        // and student object will only get created once all the validates are successful
        Student student = new Student(builder);
        System.out.println(student);
    }
}