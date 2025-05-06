package visitor.school_shapes.good;

public class GetAreaVisitor implements IGeometryVisitor {
    @Override
    public double visit(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }

    @Override
    public double visit(Square square) {
        return square.side * square.side;
    }
}
