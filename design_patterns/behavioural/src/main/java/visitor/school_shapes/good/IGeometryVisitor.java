package visitor.school_shapes.good;

public interface IGeometryVisitor {

    double visit(Circle circle);
    double visit(Square square);

}
