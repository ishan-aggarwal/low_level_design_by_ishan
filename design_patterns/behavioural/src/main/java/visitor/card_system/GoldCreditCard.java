package visitor.card_system;

public class GoldCreditCard implements CreditCard {
    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
