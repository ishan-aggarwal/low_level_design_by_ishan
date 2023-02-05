package solid.so.v1;

public class InvoiceSaver {

    private Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveInvoice() {
        System.out.println("Saving invoice to DB: " + this.invoice.totalPrice());
    }
}

// Now in this class we are saving invoice to Database.
// Let's say in future requirement comes to save the invoice to file.
// We need to change the code in this class. This is not good. It violates the Open Close Principle.
// We should not make any changes in this class. We should create a new class for saving invoice to file.
// So, we will create an interface called InvoiceSaver and move the saveInvoice() method to that interface.
// Then both DBInvoiceSaver and FileInvoiceSaver will implement this interface.
// and provide their own implementation of saveInvoice() method.
// This way we will be able to save invoice to DB and file without changing the code in this class.
// and it will help us to follow the Open Close Principle and code remains extensible.