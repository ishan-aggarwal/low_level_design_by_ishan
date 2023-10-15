package chain_of_responsibility;

public class Manager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.BILL) {
            System.out.println("Manager can approve bills");
        } else {
            System.out.println("Manager cannot approve " + request.getType());
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
