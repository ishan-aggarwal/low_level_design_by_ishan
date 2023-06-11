package visitor.car_service;

public interface CarServiceVisitor {
    void visit(Door door);

    void visit(Engine engine);

    void visit(Break breakPart);
}
