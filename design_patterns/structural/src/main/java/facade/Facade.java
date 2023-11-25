package facade;

public class Facade {

    private final ProductService productService;
    private final InvoiceService invoiceService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public Facade() {
        productService = new ProductService();
        invoiceService = new InvoiceService();
        paymentService = new PaymentService();
        notificationService = new NotificationService();
    }

    public void createOrder() {
        Product product = productService.getProduct(1);
        paymentService.makePayment();
        invoiceService.generateInvoice();
        notificationService.sendNotification();
    }
}