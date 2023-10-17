package visitor.card_system;

public interface CreditCard {
    void accept(OfferVisitor visitor);
}
