package adapter.learn;

public class SchoolApp {
    public static void main(String[] args) {
        AssignmentWork assignmentWork = new AssignmentWork();
        PenAdapter penAdapter = new PenAdapter();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssignment("This is school assignment.");
    }
}
