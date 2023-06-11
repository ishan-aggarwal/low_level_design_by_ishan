package visitor.car_service;

public interface CarPart {
    void accept(CarServiceVisitor visitor);
}
