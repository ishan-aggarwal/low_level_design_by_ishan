package solid.so.v2;

public class FileInvoiceSaver implements InvoiceSaver {

    private Invoice invoice;

    public FileInvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void saveInvoice() {
        System.out.println("Saving invoice to file: " + this.invoice.totalPrice());
    }
}

