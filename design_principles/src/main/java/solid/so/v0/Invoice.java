package solid.so.v0;

import lombok.Data;

@Data
public class Invoice {
    private Product product;
    private int quantity;
    private int totalPrice;

    public Invoice(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private int totalPrice() {
        this.totalPrice = this.product.getPrice() * this.quantity;
        return this.totalPrice;
    }

    private void printInvoice() {
        System.out.println("Total price is : " + this.totalPrice);
    }

    private void saveInvoice() {
        // save invoice to db
    }

}

// Now there are multiple reasons to change this class:
// 1. If there is change in the way we calculate the total price, then we need to update this class
// 2. If there is change in the way we print the invoice, then we need to update this class
// 3. If there is change in the way we save the invoice to db, then we need to update this class
// It does not follow the Single Responsibility Principle. It is doing multiple things.
// So, we need to refactor this class to follow the Single Responsibility Principle.
// We can do this by creating a new class called InvoicePrinter and move the printInvoice() method to that class.
// We can do this by creating a new class called InvoiceSaver and move the saveInvoice() method to that class.
// Now, this class will only be responsible for calculating the total price.
// We can also create a new class called InvoiceCalculator and move the totalPrice() method as well to that class.

