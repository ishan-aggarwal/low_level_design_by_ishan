package visitor.card_system;

public class TravelBillOfferVisitor implements OfferVisitor {
    @Override
    public void visit(BronzeCreditCard bronzeCreditCard) {
        System.out.println("Bronze card: 5% off on travel bills");
    }

    @Override
    public void visit(SilverCreditCard silverCreditCard) {
        System.out.println("Silver card: 10% off on travel bills");
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println("Gold card: 30% off on travel bills");
    }
}
