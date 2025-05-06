package visitor.school_shapes.bad;

public class Square implements IShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
