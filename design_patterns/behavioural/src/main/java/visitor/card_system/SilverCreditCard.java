package visitor.card_system;

public class SilverCreditCard implements CreditCard {
    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
