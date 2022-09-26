package prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@ToString
public class IntelligentStudent extends Student {

    private int iq;

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent); // fill the attributes specific to parent
        this.iq = intelligentStudent.iq; // fill its own attributes
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

}

// the need for calling the copy constructor from clone method is because there is no way we can access the properties of student in intelligent student
// the attributes are private and the getter methods are also not provided
// so the best way is to make use of copy constructor and from that make a call to the constructor of super class first
// Also, the need for clone method is because we want to achieve the dynamic binding (run-time polymorphism). If we would only make use of copy constructor to achieve
// the entire functionality, then we will have to depend on concrete classes only.
// Overriding the clone is not going to do the work
// How to create a copy of a child class
