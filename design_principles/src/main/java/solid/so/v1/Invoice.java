package solid.so.v1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Invoice {
    private Product product;
    private int quantity;
    private int totalPrice;

    public Invoice(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int totalPrice() {
        this.totalPrice = this.product.getPrice() * this.quantity;
        return this.totalPrice;
    }
}