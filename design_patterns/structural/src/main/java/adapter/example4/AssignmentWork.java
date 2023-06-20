package adapter.example4;

public class AssignmentWork {

    private Pen pen;

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pen getPen() {
        return pen;
    }

    public void writeAssignment(String str) {
        pen.write(str);
    }
}
