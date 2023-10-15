package chain_of_responsibility;

public class ClientApp {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler seniorManager = new SeniorManager();
        Handler director = new Director();

        manager.setNext(seniorManager);
        seniorManager.setNext(director);

        System.out.println("=====================================");
        Request request = Request.builder().name("Telephone Bill").type(RequestType.BILL).build();
        manager.handleRequest(request);
        System.out.println("=====================================");

        request = Request.builder().name("Github Permission").type(RequestType.PERMISSION).build();
        manager.handleRequest(request);
        System.out.println("=====================================");


        request = Request.builder().name("Hire New Candidate").type(RequestType.HIRE).build();
        manager.handleRequest(request);
        System.out.println("=====================================");


        request = Request.builder().name("Acquire a new company").type(RequestType.ACQUIRE_COMPANY).build();
        manager.handleRequest(request);
        System.out.println("=====================================");

    }
}
