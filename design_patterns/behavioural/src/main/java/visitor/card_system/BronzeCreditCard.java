package visitor.card_system;

public class BronzeCreditCard implements CreditCard {
    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
