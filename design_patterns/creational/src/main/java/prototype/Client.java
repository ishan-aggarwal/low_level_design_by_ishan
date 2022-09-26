package prototype;

public class Client {

    public static void main(String[] args) {

        // Get Singleton object of student registry class
        StudentRegistry registry = StudentRegistry.getInstance();

        // Get the "april21BatchStudent" student prototype from registry
        Student student = registry.get(Batch.APRIL_21_BATCH.getValue());
        // create clone of original student from registry and set the desired student specific attributes
        Student studentCopy = student.clone();
        studentCopy.setName("Ishan Aggarwal");
        studentCopy.setAge(35);
        studentCopy.setPsp(85.5f);

        System.out.println("Registry student        : " + student.hashCode());
        System.out.println("Registry student clone  : " + studentCopy.hashCode());

        // Get the "april21BatchIntelligentStudent" student prototype from registry
        Student intelligentStudent = registry.get(Batch.APRIL_21_INTELLIGENT_BATCH.getValue());
        // create clone of original intelligent student from registry and set the desired student specific attributes in it
        Student intelligentStudentCopy = intelligentStudent.clone();
        intelligentStudentCopy.setName("Karishma Mittal");
        intelligentStudentCopy.setAge(32);
        intelligentStudentCopy.setPsp(98.3f);

        System.out.println("Registry intelligent student        : " + intelligentStudent.hashCode());
        System.out.println("Registry intelligent student clone  : " + intelligentStudentCopy.hashCode());
    }
}
