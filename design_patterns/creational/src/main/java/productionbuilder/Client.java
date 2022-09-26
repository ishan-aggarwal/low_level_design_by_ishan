package productionbuilder;

public class Client {

    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Ishan Aggarwal");
//        builder.setAge(35);
//        builder.setGradYear(2023);
//        Student st = builder.build();
//        Student st = new Student(null);

        Student student = Student.getBuilder()
                .setName("Ishan Aggarwal")
                .setId(1)
                .setAge(35)
                .setPsp(89.5f)
                .setUniversityName("PU")
                .setBatch("Oct-21-batch")
                .setPhoneNumber("abc")
                .setGradYear(2021)
                .build();

        System.out.println(student);
    }
}

// refactoring.guru and sourcemaking