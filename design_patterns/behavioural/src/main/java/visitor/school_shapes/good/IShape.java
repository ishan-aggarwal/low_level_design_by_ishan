package visitor.school_shapes.good;

public interface IShape {
    double accept(IGeometryVisitor visitor);
}
