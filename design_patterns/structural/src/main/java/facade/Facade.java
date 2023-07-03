package facade;

public class Facade {

    private ProductService productService;
    private InvoiceService invoiceService;
    private PaymentService paymentService;
    private NotificationService notificationService;

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