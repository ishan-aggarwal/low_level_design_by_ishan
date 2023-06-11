package visitor.car_service;

public class TechnicalServiceStaff implements CarServiceVisitor {
    @Override
    public void visit(Door door) {
        System.out.println("Going to service door.");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Going to service car engine.");
    }

    @Override
    public void visit(Break aBreak) {
        System.out.println("Going to service car break.");
    }
}
