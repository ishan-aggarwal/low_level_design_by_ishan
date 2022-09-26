package prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@ToString
public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private float psp;

    private Batch batch;
    private float averageBatchPSP;

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;

        this.batch = student.batch;
        this.averageBatchPSP = student.averageBatchPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
