package accessmodifiers;

public class Student {
    private String name;
    int batchId; // default
    protected double psp;
    public String universityName;

    void changeBatch(int newBatchId) {
        this.name = "Ishan";
        this.batchId = newBatchId;
        this.psp = 90.0;
        this.universityName = "PU";
    }
}
