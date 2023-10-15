package chain_of_responsibility;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (RequestType.HIRE == request.getType()) {
            System.out.println("Director can approve hiring");
        } else {
            System.out.println("Director cannot approve " + request.getType());
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("No one can approve " + request.getType());
            }
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
