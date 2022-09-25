package accessmodifiers;

public class StudentChild extends Student {

    public void doSomething() {
//        this.name = "Ishan"; // ERROR: private
        this.batchId = 123; // default
        this.psp = 91.0; // protected
        this.universityName = "Panjab University"; // public
    }
}
