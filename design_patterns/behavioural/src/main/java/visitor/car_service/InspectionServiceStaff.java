package visitor.car_service;

public class InspectionServiceStaff implements CarServiceVisitor {
    @Override
    public void visit(Door door) {
        System.out.println("Doors inspection complete, all doors are functioning properly.");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Engine inspection complete, engine is functioning properly.");
    }

    @Override
    public void visit(Break aBreak) {
        System.out.println("Breaks inspection complete, breaks are functioning properly.");
    }
}

