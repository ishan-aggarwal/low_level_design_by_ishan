package prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Student implements IPrototype<Student> {

    private String name;
    private int age;
    private float psp;

    private StudentBatchEnum batch;
    private float averageBatchPSP;

    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;

        this.batch = other.batch;
        this.averageBatchPSP = other.averageBatchPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
