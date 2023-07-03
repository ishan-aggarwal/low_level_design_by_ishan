package facade;

public class ProductService {

    public Product getProduct(int productId) {
        System.out.println("Product picked with id " + productId);
        return new Product();
    }
}