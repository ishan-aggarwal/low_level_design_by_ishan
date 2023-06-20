package adapter.example4;

public class School {
    public static void main(String[] args) {
        AssignmentWork assignmentWork = new AssignmentWork();
        PenAdapter penAdapter = new PenAdapter();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssignment("This is school assignment.");
    }
}
