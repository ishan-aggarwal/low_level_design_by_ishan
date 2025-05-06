package visitor.school_shapes.good;

public class Client {
    public static void main(String[] args) {
        IShape shape = new Square(4);
        // shape interface has started accepting an object
        // where one type of behavior is implemented
        // for example, in this case it is accepting get area
        double area = shape.accept(new GetAreaVisitor());
        System.out.println(area);
    }
}
