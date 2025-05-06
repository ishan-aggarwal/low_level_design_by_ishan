package visitor.school_shapes.good;

public class Circle implements IShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double accept(IGeometryVisitor visitor) {
        return visitor.visit(this);
    }
}
