package solid.so.v2;

public class Client {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Product("Product 1", 100), 5);

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();

        InvoiceSaver invoiceSaver = new DBInvoiceSaver(invoice);
        invoiceSaver.saveInvoice();
    }
}
