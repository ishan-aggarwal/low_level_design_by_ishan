package prototype;

public class Client {

    public static void main(String[] args) {

        // Get Singleton object of student registry class
        IRegistry registry = StudentRegistry.getInstance();

        // Get the "april21BatchStudent" student prototype from registry
        Student student = (Student) registry.get(StudentBatchEnum.APRIL_21_BATCH_STUDENT.getValue());

        // create clone of original student from registry and set the desired student specific attributes
        Student studentCopy = student.clone();
        studentCopy.setName("Ishan Aggarwal");
        studentCopy.setAge(35);
        studentCopy.setPsp(85.5f);

        System.out.println("Registry student        : " + student.hashCode());
        System.out.println("Registry student clone  : " + studentCopy.hashCode());

        // Get the "april21BatchIntelligentStudent" student prototype from registry
        IntelligentStudent intelligentStudent = (IntelligentStudent) registry.get(StudentBatchEnum.APRIL_21_BATCH_INTELLIGENT_STUDENT.getValue());

        // create clone of original intelligent student from registry and set the desired student specific attributes in it
        IntelligentStudent intelligentStudentCopy = intelligentStudent.clone();
        intelligentStudentCopy.setName("Karishma Mittal");
        intelligentStudentCopy.setAge(32);
        intelligentStudentCopy.setPsp(98.3f);

        System.out.println("Registry intelligent student        : " + intelligentStudent.hashCode());
        System.out.println("Registry intelligent student clone  : " + intelligentStudentCopy.hashCode());

    }
}
