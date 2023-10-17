package visitor.card_system;

public interface OfferVisitor {
    void visit(BronzeCreditCard bronzeCreditCard);

    void visit(SilverCreditCard silverCreditCard);

    void visit(GoldCreditCard goldCreditCard);
}
