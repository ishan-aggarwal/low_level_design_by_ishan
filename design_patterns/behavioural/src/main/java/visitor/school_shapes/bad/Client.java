package visitor.school_shapes.bad;

public class Client {
    public static void main(String[] args) {
        IShape shape = new Square(4);
        System.out.println(shape.getArea());
    }
}
