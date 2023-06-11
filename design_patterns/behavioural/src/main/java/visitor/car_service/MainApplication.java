package visitor.car_service;

public class MainApplication {

    public static void main(String[] args) {
        Door door = new Door();
        Engine engine = new Engine();
        Break aBreak = new Break();

        TechnicalServiceStaff technicalServiceStaff = new TechnicalServiceStaff();
        InspectionServiceStaff inspectionServiceStaff = new InspectionServiceStaff();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Behavior added to car parts at runtime. Going to service car parts.");
        door.accept(technicalServiceStaff);
        engine.accept(technicalServiceStaff);
        aBreak.accept(technicalServiceStaff);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Behavior added to car parts at runtime. Going to inspect car parts.");
        door.accept(inspectionServiceStaff);
        engine.accept(inspectionServiceStaff);
        aBreak.accept(inspectionServiceStaff);
    }
}
