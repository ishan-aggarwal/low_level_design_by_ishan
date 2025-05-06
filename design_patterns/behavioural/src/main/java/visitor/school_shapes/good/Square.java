package visitor.school_shapes.good;

public class Square implements IShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double accept(IGeometryVisitor visitor) {
        return visitor.visit(this);
    }
}
