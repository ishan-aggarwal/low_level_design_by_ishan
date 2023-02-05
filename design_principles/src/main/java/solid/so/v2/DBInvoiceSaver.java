package solid.so.v2;

public class DBInvoiceSaver implements InvoiceSaver {

    private Invoice invoice;

    public DBInvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }
    @Override
    public void saveInvoice() {
        System.out.println("Saving invoice to DB: " + this.invoice.totalPrice());
    }
}
