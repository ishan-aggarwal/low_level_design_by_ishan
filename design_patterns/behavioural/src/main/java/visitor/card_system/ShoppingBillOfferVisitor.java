package visitor.card_system;

public class ShoppingBillOfferVisitor implements OfferVisitor {
    @Override
    public void visit(BronzeCreditCard bronzeCreditCard) {
        System.out.println("Bronze card: 10% off on shopping bill");
    }

    @Override
    public void visit(SilverCreditCard silverCreditCard) {
        System.out.println("Silver card: 20% off on shopping bill");
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println("Gold card: 30% off on shopping bill");
    }
}
